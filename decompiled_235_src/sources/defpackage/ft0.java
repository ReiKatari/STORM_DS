package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft0  reason: default package */
/* loaded from: classes.dex */
public final class ft0 implements zc7 {
    public final /* synthetic */ int A;
    public final ci B;

    public /* synthetic */ ft0(ci ciVar, int i) {
        this.A = i;
        this.B = ciVar;
    }

    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        Type[] actualTypeArguments;
        yc7 yc7Var;
        int i = this.A;
        ci ciVar = this.B;
        Type type = Object.class;
        switch (i) {
            case 0:
                Type type2 = ie7Var.b;
                Class cls = ie7Var.a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type K = q60.K(type2, cls, Collection.class);
                if (K instanceof ParameterizedType) {
                    type = ((ParameterizedType) K).getActualTypeArguments()[0];
                }
                return new et0(0, new lc3(su2Var, su2Var.d(new ie7(type)), type, 2), ciVar.l(ie7Var, false));
            default:
                Type type3 = ie7Var.b;
                Class cls2 = ie7Var.a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type K2 = q60.K(type3, cls2, Map.class);
                    actualTypeArguments = K2 instanceof ParameterizedType ? ((ParameterizedType) K2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    yc7Var = su2Var.d(new ie7(type4));
                } else {
                    yc7Var = fe7.c;
                }
                return new lc3(this, new lc3(su2Var, yc7Var, type4, 2), new lc3(su2Var, su2Var.d(new ie7(type5)), type5, 2), ciVar.l(ie7Var, false));
        }
    }
}
