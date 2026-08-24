package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ip implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;

    public /* synthetic */ ip(xb2 xb2Var, ArrayList arrayList) {
        this.A = 1;
        this.B = arrayList;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Object em5Var;
        boolean z;
        boolean z2;
        int[] iArr;
        int i;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        int i3 = 1;
        int i4 = 0;
        ArrayList arrayList = this.B;
        switch (i2) {
            case 0:
                cx4 cx4Var = (cx4) obj;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    cx4.l(cx4Var, (dx4) arrayList.get(i5), 0, 0);
                }
                return jg7Var;
            case 1:
                Uri uri = ((pq5) obj).e;
                if (uri != null) {
                    try {
                        em5Var = DocumentsContract.getDocumentId(uri);
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    if (em5Var instanceof em5) {
                        em5Var = null;
                    }
                    String str = (String) em5Var;
                    if (str != null) {
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                Object obj2 = arrayList.get(i6);
                                i6++;
                                if (xs6.g0(str, (String) obj2, false)) {
                                    z = true;
                                    z2 = z;
                                    return Boolean.valueOf(z2);
                                }
                            }
                        }
                        z = false;
                        z2 = z;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 2:
                cx4 cx4Var2 = (cx4) obj;
                int size3 = arrayList.size();
                int i7 = 0;
                while (i7 < size3) {
                    i34 i34Var = (i34) arrayList.get(i7);
                    List list = i34Var.b;
                    boolean z3 = i34Var.g;
                    if (i34Var.k == Integer.MIN_VALUE) {
                        s53.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i8 = i4;
                    while (i8 < size4) {
                        dx4 dx4Var = (dx4) list.get(i8);
                        long c = i93.c((iArr[i + i3] & 4294967295L) | (i34Var.i[i8 * 2] << 32), i34Var.c);
                        if (z3) {
                            cx4.r(cx4Var2, dx4Var, c);
                        } else {
                            cx4.n(cx4Var2, dx4Var, c);
                        }
                        i8++;
                        i3 = 1;
                    }
                    i7++;
                    i3 = 1;
                    i4 = 0;
                }
                return jg7Var;
            default:
                cx4 cx4Var3 = (cx4) obj;
                int size5 = arrayList.size();
                for (int i9 = 0; i9 < size5; i9++) {
                    cx4.j(cx4Var3, (dx4) arrayList.get(i9), 0, 0);
                }
                return jg7Var;
        }
    }

    public /* synthetic */ ip(int i, ArrayList arrayList) {
        this.A = i;
        this.B = arrayList;
    }
}
