package defpackage;

import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is4  reason: default package */
/* loaded from: classes.dex */
public final class is4 extends uj2 {
    public final /* synthetic */ int h;
    public final Method i;
    public final int j;
    public final boolean k;

    public /* synthetic */ is4(Method method, int i, boolean z, int i2) {
        this.h = i2;
        this.i = method;
        this.j = i;
        this.k = z;
    }

    @Override // defpackage.uj2
    public final void l(ok5 ok5Var, Object obj) {
        int i = this.h;
        boolean z = this.k;
        Method method = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj2 = value.toString();
                                if (obj2 != null) {
                                    ok5Var.a(str, obj2, z);
                                } else {
                                    throw ak7.v0(method, i2, "Field map value '" + value + "' converted to null by " + d90.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw ak7.v0(method, i2, lb1.A("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw ak7.v0(method, i2, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ak7.v0(method, i2, "Field map was null.", new Object[0]);
            case 1:
                Map map2 = (Map) obj;
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                ok5Var.b(str2, value2.toString(), z);
                            } else {
                                throw ak7.v0(method, i2, lb1.A("Header map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw ak7.v0(method, i2, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ak7.v0(method, i2, "Header map was null.", new Object[0]);
            default:
                Map map3 = (Map) obj;
                if (map3 != null) {
                    for (Map.Entry entry3 : map3.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        if (str3 != null) {
                            Object value3 = entry3.getValue();
                            if (value3 != null) {
                                String obj3 = value3.toString();
                                if (obj3 != null) {
                                    ok5Var.d(str3, obj3, z);
                                } else {
                                    throw ak7.v0(method, i2, "Query map value '" + value3 + "' converted to null by " + d90.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                                }
                            } else {
                                throw ak7.v0(method, i2, lb1.A("Query map contained null value for key '", str3, "'."), new Object[0]);
                            }
                        } else {
                            throw ak7.v0(method, i2, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ak7.v0(method, i2, "Query map was null", new Object[0]);
        }
    }
}
