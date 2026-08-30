package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a85  reason: default package */
/* loaded from: classes.dex */
public final class a85 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ dz6 f;
    public final /* synthetic */ dz6 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public a85(String str, Field field, boolean z, Method method, dz6 dz6Var, dz6 dz6Var2, boolean z2, boolean z3) {
        this.d = z;
        this.e = method;
        this.f = dz6Var;
        this.g = dz6Var2;
        this.h = z2;
        this.i = z3;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(b93 b93Var, Object obj) {
        Object obj2;
        boolean z = this.d;
        Field field = this.b;
        Method method = this.e;
        if (z) {
            if (method == null) {
                f85.b(obj, field);
            } else {
                f85.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(wh1.A("Accessor ", y75.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        b93Var.C(this.a);
        this.f.c(b93Var, obj2);
    }
}
