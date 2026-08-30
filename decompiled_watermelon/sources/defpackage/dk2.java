package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dk2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dk2 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;

    public /* synthetic */ dk2(int i, long j, Object obj) {
        this.A = i;
        this.B = j;
        this.L = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, wk0] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        Long valueOf;
        Long valueOf2;
        List arrayList;
        Long valueOf3;
        boolean z;
        float f;
        boolean z2;
        int i = this.A;
        Object obj2 = null;
        Object obj3 = this.L;
        long j = this.B;
        switch (i) {
            case 0:
                ek2 ek2Var = (ek2) obj3;
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("SELECT * FROM cheat_folder WHERE game_id = ?");
                try {
                    i0.g(1, j);
                    int r = hi2.r(i0, "id");
                    int r2 = hi2.r(i0, "game_id");
                    int r3 = hi2.r(i0, "name");
                    cs3 cs3Var = new cs3((Object) null);
                    while (i0.a0()) {
                        if (i0.isNull(r)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(i0.getLong(r));
                        }
                        if (valueOf3 != null) {
                            if (cs3Var.c(valueOf3.longValue()) >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                cs3Var.g(valueOf3.longValue(), new ArrayList());
                            }
                        }
                    }
                    i0.reset();
                    ek2Var.a(ls5Var, cs3Var);
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.a0()) {
                        if (i0.isNull(r)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(r));
                        }
                        uk0 uk0Var = new uk0(valueOf, i0.getLong(r2), i0.q(r3));
                        if (i0.isNull(r)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(i0.getLong(r));
                        }
                        if (valueOf2 != null) {
                            Object b = cs3Var.b(valueOf2.longValue());
                            if (b != null) {
                                arrayList = (List) b;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        ?? obj4 = new Object();
                        obj4.a = uk0Var;
                        obj4.b = arrayList;
                        arrayList2.add(obj4);
                    }
                    i0.close();
                    return arrayList2;
                } finally {
                }
            case 1:
                ih4 ih4Var = (ih4) obj3;
                xf3 xf3Var = (xf3) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                float f2 = RecyclerView.A1;
                if (intBitsToFloat > RecyclerView.A1) {
                    float C = xf3Var.C(4.0f);
                    rh0 rh0Var = xf3Var.A;
                    float C2 = xf3Var.C(ih4Var.a(xf3Var.getLayoutDirection())) - C;
                    float f3 = (C * 2.0f) + intBitsToFloat + C2;
                    sd3 layoutDirection = xf3Var.getLayoutDirection();
                    int[] iArr = uf4.a;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        f = Float.intBitsToFloat((int) (rh0Var.d() >> 32)) - f3;
                    } else if (C2 < RecyclerView.A1) {
                        f = 0.0f;
                    } else {
                        f = C2;
                    }
                    float f4 = f;
                    if (iArr[xf3Var.getLayoutDirection().ordinal()] == 1) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (rh0Var.d() >> 32));
                        if (C2 >= RecyclerView.A1) {
                            f2 = C2;
                        }
                        f3 = intBitsToFloat2 - f2;
                    }
                    float f5 = f3;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & j));
                    float f6 = (-intBitsToFloat3) / 2.0f;
                    float f7 = intBitsToFloat3 / 2.0f;
                    os osVar = rh0Var.B;
                    long E = osVar.E();
                    osVar.s().m();
                    try {
                        ((bq0) osVar.B).P(f4, f6, f5, f7, 0);
                        xf3Var.a();
                    } finally {
                        wh1.u(osVar, E);
                    }
                } else {
                    xf3Var.a();
                }
                return o27.a;
            default:
                hd5 hd5Var = (hd5) obj3;
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT * FROM ra_game WHERE game_id = ?");
                try {
                    i0.g(1, j);
                    int r4 = hi2.r(i0, "game_id");
                    int r5 = hi2.r(i0, "rich_presence_patch");
                    int r6 = hi2.r(i0, "title");
                    int r7 = hi2.r(i0, "icon");
                    cs3 cs3Var2 = new cs3((Object) null);
                    while (i0.a0()) {
                        long j2 = i0.getLong(r4);
                        if (cs3Var2.c(j2) >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            cs3Var2.g(j2, new ArrayList());
                        }
                    }
                    i0.reset();
                    hd5Var.L(ls5Var2, cs3Var2);
                    if (i0.a0()) {
                        long j3 = i0.getLong(r4);
                        if (!i0.isNull(r5)) {
                            obj2 = i0.q(r5);
                        }
                        u05 u05Var = new u05(j3, obj2, i0.q(r6), i0.q(r7));
                        Object b2 = cs3Var2.b(i0.getLong(r4));
                        if (b2 != null) {
                            obj2 = new a15(u05Var, (List) b2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    return obj2;
                } finally {
                    i0.close();
                }
        }
    }
}
