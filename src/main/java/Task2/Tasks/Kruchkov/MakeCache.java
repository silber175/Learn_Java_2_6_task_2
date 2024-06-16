package Task2.Tasks.Kruchkov;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MakeCache implements InvocationHandler {
    private Object casheObj;
    private Method objMeth;
     private Map<Method, Object> prevResult = new HashMap<>();

    public MakeCache(Object obj) {
         this.casheObj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        objMeth = this.casheObj.getClass().getMethod(method.getName(),method.getParameterTypes());

        if (objMeth.isAnnotationPresent(Cashe.class))    {
            if (prevResult.containsKey(objMeth))   {
                return prevResult.get(objMeth);
            }
            else {
                Object tmp = method.invoke(this.casheObj,args);
                prevResult.put(objMeth, tmp);
                return tmp;
            }
        }
        if (objMeth.isAnnotationPresent(Mutator.class)) {
           prevResult.clear();
        }
        return method.invoke(this.casheObj, args);
    }
}
