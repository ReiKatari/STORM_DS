package defpackage;

import defpackage.v41;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x41  reason: default package */
/* loaded from: classes.dex */
public final class x41 implements if3, be3 {
    public final Type a = new ie7().b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: x41$a */
    /* loaded from: classes.dex */
    public static final class a extends ie7<List<? extends k63>> {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r2 != null) goto L15;
     */
    @Override // defpackage.be3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ee3 ee3Var, Type type, j97 j97Var) {
        ze3 ze3Var;
        v41.c cVar;
        ee3Var.getClass();
        type.getClass();
        j97Var.getClass();
        ee3 ee3Var2 = null;
        if (ee3Var instanceof ze3) {
            ze3Var = ee3Var.b();
        } else {
            ze3Var = null;
        }
        if (ze3Var != null) {
            aw3 aw3Var = ze3Var.A;
            ee3 ee3Var3 = (ee3) aw3Var.get("inputMapper");
            if (ee3Var3 != null) {
                List list = (List) j97Var.d(ee3Var3, this.a);
                ee3 ee3Var4 = (ee3) aw3Var.get("slot2AnalogMapping");
                if (ee3Var4 != null) {
                    if (!(ee3Var4 instanceof ve3)) {
                        ee3Var2 = ee3Var4;
                    }
                    if (ee3Var2 != null) {
                        cVar = (v41.c) j97Var.d(ee3Var2, v41.c.class);
                    }
                }
                cVar = new v41.c();
                list.getClass();
                return new v41(list, cVar);
            }
            throw new RuntimeException("Missing controller configuration field 'inputMapper'");
        }
        throw new RuntimeException("Controller configuration must be an object");
    }

    @Override // defpackage.if3
    public final ee3 b(Object obj, Type type, j97 j97Var) {
        v41 v41Var = (v41) obj;
        v41Var.getClass();
        type.getClass();
        j97Var.getClass();
        ze3 ze3Var = new ze3();
        List list = v41Var.a;
        yb7 yb7Var = (yb7) j97Var.B;
        su2 su2Var = yb7Var.c;
        su2Var.getClass();
        tf3 tf3Var = new tf3();
        su2Var.g(list, this.a, tf3Var);
        ArrayList arrayList = tf3Var.k0;
        if (arrayList.isEmpty()) {
            ze3Var.d("inputMapper", tf3Var.m0);
            v41.c cVar = v41Var.b;
            su2 su2Var2 = yb7Var.c;
            su2Var2.getClass();
            tf3 tf3Var2 = new tf3();
            su2Var2.g(cVar, v41.c.class, tf3Var2);
            ArrayList arrayList2 = tf3Var2.k0;
            if (arrayList2.isEmpty()) {
                ze3Var.d("slot2AnalogMapping", tf3Var2.m0);
                return ze3Var;
            }
            e41.y(arrayList2, "Expected one JSON element but was ");
            return null;
        }
        e41.y(arrayList, "Expected one JSON element but was ");
        return null;
    }
}
