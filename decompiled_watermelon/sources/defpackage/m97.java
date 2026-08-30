package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m97  reason: default package */
/* loaded from: classes.dex */
public final class m97 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean a() {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.d;
            int i7 = this.b;
            if (i6 > i7) {
                i3 = 1;
            } else if (i6 == i7) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.d;
            int i9 = this.c;
            if (i8 > i9) {
                i2 = 1;
            } else if (i8 == i9) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.e;
            int i11 = this.b;
            if (i10 > i11) {
                i = 1;
            } else if (i10 == i11) {
                i = 2;
            } else {
                i = 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.e;
            int i13 = this.c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i4) == 0) {
                return false;
            }
        }
        return true;
    }
}
