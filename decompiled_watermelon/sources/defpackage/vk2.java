package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vk2  reason: default package */
/* loaded from: classes.dex */
public final class vk2 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final j14 e;
    public final il6 f;

    public vk2(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            or4.a("Invalid start index");
        }
        this.d = new ArrayList();
        j14 j14Var = new j14();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ga3 ga3Var = (ga3) this.a.get(i3);
            int i4 = ga3Var.c;
            int i5 = ga3Var.d;
            j14Var.i(i4, new ko2(i3, i2, i5));
            i2 += i5;
        }
        this.e = j14Var;
        this.f = new il6(new jz(2, this));
    }

    public final boolean a(int i, int i2) {
        ko2 ko2Var;
        int i3;
        int i4;
        j14 j14Var = this.e;
        ko2 ko2Var2 = (ko2) j14Var.b(i);
        if (ko2Var2 == null) {
            return false;
        }
        int i5 = ko2Var2.b;
        int i6 = i2 - ko2Var2.c;
        ko2Var2.c = i2;
        if (i6 != 0) {
            Object[] objArr = j14Var.c;
            long[] jArr = j14Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j = jArr[i7];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j) < 128 && (i3 = (ko2Var = (ko2) objArr[(i7 << 3) + i9]).b) >= i5 && ko2Var != ko2Var2 && (i4 = i3 + i6) >= 0) {
                                ko2Var.b = i4;
                            }
                            j >>= 8;
                        }
                        if (i8 != 8) {
                            return true;
                        }
                    }
                    if (i7 != length) {
                        i7++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
