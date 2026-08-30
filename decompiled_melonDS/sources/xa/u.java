package xa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final String f14513a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f14514b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14515c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f14516d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Method f14517e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ua.u f14518f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ua.u f14519g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f14520h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f14521i;

    public u(String str, Field field, boolean z10, Method method, ua.u uVar, ua.u uVar2, boolean z11, boolean z12) {
        this.f14516d = z10;
        this.f14517e = method;
        this.f14518f = uVar;
        this.f14519g = uVar2;
        this.f14520h = z11;
        this.f14521i = z12;
        this.f14513a = str;
        this.f14514b = field;
        this.f14515c = field.getName();
    }

    public final void a(cb.c cVar, Object obj) {
        Object obj2;
        boolean z10 = this.f14516d;
        Field field = this.f14514b;
        Method method = this.f14517e;
        if (z10) {
            if (method == null) {
                z.b(obj, field);
            } else {
                z.b(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException(kc.a.g("Accessor ", za.c.d(method, false), " threw exception"), e6.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        cVar.z(this.f14513a);
        this.f14518f.c(cVar, obj2);
    }
}
