package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qh5  reason: default package */
/* loaded from: classes.dex */
public final class qh5 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ yc7 f;
    public final /* synthetic */ yc7 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public qh5(String str, Field field, boolean z, Method method, yc7 yc7Var, yc7 yc7Var2, boolean z2, boolean z3) {
        this.d = z;
        this.e = method;
        this.f = yc7Var;
        this.g = yc7Var2;
        this.h = z2;
        this.i = z3;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(vf3 vf3Var, Object obj) {
        Object obj2;
        boolean z = this.d;
        Field field = this.b;
        Method method = this.e;
        if (z) {
            if (method == null) {
                vh5.b(obj, field);
            } else {
                vh5.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(lb1.A("Accessor ", oh5.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        vf3Var.v(this.a);
        this.f.c(vf3Var, obj2);
    }
}
