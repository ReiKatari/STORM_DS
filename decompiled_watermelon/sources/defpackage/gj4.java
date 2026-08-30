package defpackage;

import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gj4  reason: default package */
/* loaded from: classes.dex */
public final class gj4 extends cg2 {
    public final /* synthetic */ int g;
    public final Method h;
    public final int i;
    public final boolean j;

    public /* synthetic */ gj4(Method method, int i, boolean z, int i2) {
        this.g = i2;
        this.h = method;
        this.i = i;
        this.j = z;
    }

    @Override // defpackage.cg2
    public final void t(wa5 wa5Var, Object obj) {
        int i = this.g;
        boolean z = this.j;
        Method method = this.h;
        int i2 = this.i;
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
                                    wa5Var.a(str, obj2, z);
                                } else {
                                    throw ct3.F0(method, i2, "Field map value '" + value + "' converted to null by " + y60.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw ct3.F0(method, i2, wh1.A("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw ct3.F0(method, i2, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ct3.F0(method, i2, "Field map was null.", new Object[0]);
            case 1:
                Map map2 = (Map) obj;
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                wa5Var.b(str2, value2.toString(), z);
                            } else {
                                throw ct3.F0(method, i2, wh1.A("Header map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw ct3.F0(method, i2, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ct3.F0(method, i2, "Header map was null.", new Object[0]);
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
                                    wa5Var.d(str3, obj3, z);
                                } else {
                                    throw ct3.F0(method, i2, "Query map value '" + value3 + "' converted to null by " + y60.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                                }
                            } else {
                                throw ct3.F0(method, i2, wh1.A("Query map contained null value for key '", str3, "'."), new Object[0]);
                            }
                        } else {
                            throw ct3.F0(method, i2, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ct3.F0(method, i2, "Query map was null", new Object[0]);
        }
    }
}
