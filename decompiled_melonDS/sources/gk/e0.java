package gk;

import java.lang.reflect.Method;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends y0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5724d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f5725e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5726f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5727g;

    public /* synthetic */ e0(Method method, int i2, boolean z10, int i10) {
        this.f5724d = i10;
        this.f5725e = method;
        this.f5726f = i2;
        this.f5727g = z10;
    }

    @Override // gk.y0
    public final void a(o0 o0Var, Object obj) {
        switch (this.f5724d) {
            case 0:
                Map map = (Map) obj;
                int i2 = this.f5726f;
                Method method = this.f5725e;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj2 = value.toString();
                                if (obj2 != null) {
                                    o0Var.a(str, obj2, this.f5727g);
                                } else {
                                    throw y0.n(method, i2, "Field map value '" + value + "' converted to null by " + b.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw y0.n(method, i2, kc.a.g("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw y0.n(method, i2, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw y0.n(method, i2, "Field map was null.", new Object[0]);
            case DSiCameraSource.FrontCamera /* 1 */:
                Map map2 = (Map) obj;
                int i10 = this.f5726f;
                Method method2 = this.f5725e;
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                o0Var.b(str2, value2.toString(), this.f5727g);
                            } else {
                                throw y0.n(method2, i10, kc.a.g("Header map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw y0.n(method2, i10, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw y0.n(method2, i10, "Header map was null.", new Object[0]);
            default:
                Map map3 = (Map) obj;
                int i11 = this.f5726f;
                Method method3 = this.f5725e;
                if (map3 != null) {
                    for (Map.Entry entry3 : map3.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        if (str3 != null) {
                            Object value3 = entry3.getValue();
                            if (value3 != null) {
                                String obj3 = value3.toString();
                                if (obj3 != null) {
                                    o0Var.d(str3, obj3, this.f5727g);
                                } else {
                                    throw y0.n(method3, i11, "Query map value '" + value3 + "' converted to null by " + b.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                                }
                            } else {
                                throw y0.n(method3, i11, kc.a.g("Query map contained null value for key '", str3, "'."), new Object[0]);
                            }
                        } else {
                            throw y0.n(method3, i11, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw y0.n(method3, i11, "Query map was null", new Object[0]);
        }
    }
}
