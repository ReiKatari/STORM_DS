package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hp2 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;

    public /* synthetic */ hp2(Object obj, long j, int i) {
        this.A = i;
        this.B = j;
        this.L = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [en0, java.lang.Object] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
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
                ip2 ip2Var = (ip2) obj3;
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                i0 = e36Var.i0("SELECT * FROM cheat_folder WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    int B = ej2.B(i0, "id");
                    int B2 = ej2.B(i0, "game_id");
                    int B3 = ej2.B(i0, "name");
                    hz3 hz3Var = new hz3((Object) null);
                    while (i0.f0()) {
                        if (i0.isNull(B)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(i0.getLong(B));
                        }
                        if (valueOf3 != null) {
                            if (hz3Var.c(valueOf3.longValue()) >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                hz3Var.f(valueOf3.longValue(), new ArrayList());
                            }
                        }
                    }
                    i0.reset();
                    ip2Var.a(e36Var, hz3Var);
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.f0()) {
                        if (i0.isNull(B)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(B));
                        }
                        cn0 cn0Var = new cn0(valueOf, i0.getLong(B2), i0.R(B3));
                        if (i0.isNull(B)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(i0.getLong(B));
                        }
                        if (valueOf2 != null) {
                            Object b = hz3Var.b(valueOf2.longValue());
                            if (b != null) {
                                arrayList = (List) b;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        ?? obj4 = new Object();
                        obj4.a = cn0Var;
                        obj4.b = arrayList;
                        arrayList2.add(obj4);
                    }
                    i0.close();
                    return arrayList2;
                } finally {
                }
            case 1:
                lq4 lq4Var = (lq4) obj3;
                um3 um3Var = (um3) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                float f2 = RecyclerView.B1;
                if (intBitsToFloat > RecyclerView.B1) {
                    float e0 = um3Var.e0(4.0f);
                    zj0 zj0Var = um3Var.A;
                    float e02 = um3Var.e0(lq4Var.b(um3Var.getLayoutDirection())) - e0;
                    float f3 = (e0 * 2.0f) + intBitsToFloat + e02;
                    kk3 layoutDirection = um3Var.getLayoutDirection();
                    int[] iArr = yo4.a;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        f = Float.intBitsToFloat((int) (zj0Var.e() >> 32)) - f3;
                    } else if (e02 < RecyclerView.B1) {
                        f = 0.0f;
                    } else {
                        f = e02;
                    }
                    float f4 = f;
                    if (iArr[um3Var.getLayoutDirection().ordinal()] == 1) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (zj0Var.e() >> 32));
                        if (e02 >= RecyclerView.B1) {
                            f2 = e02;
                        }
                        f3 = intBitsToFloat2 - f2;
                    }
                    float f5 = f3;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & j));
                    float f6 = (-intBitsToFloat3) / 2.0f;
                    float f7 = intBitsToFloat3 / 2.0f;
                    bt btVar = zj0Var.B;
                    long L = btVar.L();
                    btVar.G().h();
                    try {
                        ((os0) btVar.B).Q(f4, f6, f5, f7, 0);
                        um3Var.b();
                    } finally {
                        xg6.v(btVar, L);
                    }
                } else {
                    um3Var.b();
                }
                return jg7.a;
            default:
                bn5 bn5Var = (bn5) obj3;
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                i0 = e36Var2.i0("SELECT * FROM ra_game WHERE game_id = ?");
                try {
                    i0.c(1, j);
                    int B4 = ej2.B(i0, "game_id");
                    int B5 = ej2.B(i0, "rich_presence_patch");
                    int B6 = ej2.B(i0, "title");
                    int B7 = ej2.B(i0, "icon");
                    hz3 hz3Var2 = new hz3((Object) null);
                    while (i0.f0()) {
                        long j2 = i0.getLong(B4);
                        if (hz3Var2.c(j2) >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            hz3Var2.f(j2, new ArrayList());
                        }
                    }
                    i0.reset();
                    bn5Var.L(e36Var2, hz3Var2);
                    if (i0.f0()) {
                        long j3 = i0.getLong(B4);
                        if (!i0.isNull(B5)) {
                            obj2 = i0.R(B5);
                        }
                        ea5 ea5Var = new ea5(j3, obj2, i0.R(B6), i0.R(B7));
                        Object b2 = hz3Var2.b(i0.getLong(B4));
                        if (b2 != null) {
                            obj2 = new ka5(ea5Var, (List) b2);
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
