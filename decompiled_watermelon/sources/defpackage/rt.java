package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rt  reason: default package */
/* loaded from: classes.dex */
public abstract class rt {
    public static final lt a = new lt(3);
    public static final lt b = new lt(2);
    public static final mt c = new mt();
    public static final sn1 d = new sn1(21);
    public static final k45 e = new k45(21);

    public static void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i7;
            } else {
                return;
            }
        }
    }

    public static void b(int i, int[] iArr, int[] iArr2, boolean z) {
        float f;
        if (iArr.length != 0) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            float max = (i - i3) / Math.max(iArr.length - 1, 1);
            if (z && iArr.length == 1) {
                f = max;
            } else {
                f = RecyclerView.A1;
            }
            if (!z) {
                int length = iArr.length;
                int i5 = 0;
                while (i2 < length) {
                    int i6 = iArr[i2];
                    iArr2[i5] = Math.round(f);
                    f += i6 + max;
                    i2++;
                    i5++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i7 + max;
            }
        }
    }
}
