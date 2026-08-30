package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wo implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;

    public /* synthetic */ wo(d72 d72Var, ArrayList arrayList) {
        this.A = 1;
        this.B = arrayList;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        Object kc5Var;
        boolean z;
        boolean z2;
        int[] iArr;
        int i;
        int i2 = this.A;
        o27 o27Var = o27.a;
        int i3 = 1;
        int i4 = 0;
        ArrayList arrayList = this.B;
        switch (i2) {
            case 0:
                xn4 xn4Var = (xn4) obj;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    xn4.m(xn4Var, (yn4) arrayList.get(i5), 0, 0);
                }
                return o27Var;
            case 1:
                rg5 rg5Var = (rg5) obj;
                rg5Var.getClass();
                Uri uri = rg5Var.e;
                if (uri != null) {
                    try {
                        kc5Var = DocumentsContract.getDocumentId(uri);
                    } catch (Throwable th) {
                        kc5Var = new kc5(th);
                    }
                    if (kc5Var instanceof kc5) {
                        kc5Var = null;
                    }
                    String str = (String) kc5Var;
                    if (str != null) {
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                Object obj2 = arrayList.get(i6);
                                i6++;
                                if (gh6.n0(str, (String) obj2, false)) {
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
                xn4 xn4Var2 = (xn4) obj;
                int size3 = arrayList.size();
                int i7 = 0;
                while (i7 < size3) {
                    xv3 xv3Var = (xv3) arrayList.get(i7);
                    List list = xv3Var.b;
                    boolean z3 = xv3Var.g;
                    if (xv3Var.k == Integer.MIN_VALUE) {
                        pz2.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i8 = i4;
                    while (i8 < size4) {
                        yn4 yn4Var = (yn4) list.get(i8);
                        long c = a33.c((iArr[i + i3] & 4294967295L) | (xv3Var.i[i8 * 2] << 32), xv3Var.c);
                        if (z3) {
                            xn4.s(xn4Var2, yn4Var, c);
                        } else {
                            xn4.p(xn4Var2, yn4Var, c);
                        }
                        i8++;
                        i3 = 1;
                    }
                    i7++;
                    i3 = 1;
                    i4 = 0;
                }
                return o27Var;
            default:
                xn4 xn4Var3 = (xn4) obj;
                int size5 = arrayList.size();
                for (int i9 = 0; i9 < size5; i9++) {
                    xn4.k(xn4Var3, (yn4) arrayList.get(i9), 0, 0);
                }
                return o27Var;
        }
    }

    public /* synthetic */ wo(int i, ArrayList arrayList) {
        this.A = i;
        this.B = arrayList;
    }
}
