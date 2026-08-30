package xa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements ua.v {
    public final /* synthetic */ int A;
    public final p1.a0 B;

    public /* synthetic */ d(p1.a0 a0Var, int i2) {
        this.A = i2;
        this.B = a0Var;
    }

    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        Type[] actualTypeArguments;
        ua.u uVar;
        int i2 = this.A;
        p1.a0 a0Var = this.B;
        Type type = Object.class;
        switch (i2) {
            case 0:
                Type type2 = aVar.f2156b;
                Class cls = aVar.f2155a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type h2 = wa.i.h(type2, cls, Collection.class);
                if (h2 instanceof ParameterizedType) {
                    type = ((ParameterizedType) h2).getActualTypeArguments()[0];
                }
                return new c(new o(hVar, hVar.c(new bb.a(type)), type), a0Var.w(aVar, false));
            default:
                Type type3 = aVar.f2156b;
                Class cls2 = aVar.f2155a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type h10 = wa.i.h(type3, cls2, Map.class);
                    actualTypeArguments = h10 instanceof ParameterizedType ? ((ParameterizedType) h10).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    uVar = hVar.c(new bb.a(type4));
                } else {
                    uVar = g1.f14470c;
                }
                return new o(this, new o(hVar, uVar, type4), new o(hVar, hVar.c(new bb.a(type5)), type5), a0Var.w(aVar, false));
        }
    }
}
