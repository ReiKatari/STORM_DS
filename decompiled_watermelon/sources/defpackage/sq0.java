package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sq0  reason: default package */
/* loaded from: classes.dex */
public final class sq0 implements ez6 {
    public final /* synthetic */ int A;
    public final qh B;

    public /* synthetic */ sq0(qh qhVar, int i) {
        this.A = i;
        this.B = qhVar;
    }

    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        Type[] actualTypeArguments;
        dz6 dz6Var;
        int i = this.A;
        qh qhVar = this.B;
        Type type = Object.class;
        switch (i) {
            case 0:
                Type type2 = n07Var.b;
                Class cls = n07Var.a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type T = l07.T(type2, cls, Collection.class);
                if (T instanceof ParameterizedType) {
                    type = ((ParameterizedType) T).getActualTypeArguments()[0];
                }
                return new rq0(0, new x53(qo2Var, qo2Var.d(new n07(type)), type, 2), qhVar.k(n07Var, false));
            default:
                Type type3 = n07Var.b;
                Class cls2 = n07Var.a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type T2 = l07.T(type3, cls2, Map.class);
                    actualTypeArguments = T2 instanceof ParameterizedType ? ((ParameterizedType) T2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    dz6Var = qo2Var.d(new n07(type4));
                } else {
                    dz6Var = k07.c;
                }
                return new x53(this, new x53(qo2Var, dz6Var, type4, 2), new x53(qo2Var, qo2Var.d(new n07(type5)), type5, 2), qhVar.k(n07Var, false));
        }
    }
}
