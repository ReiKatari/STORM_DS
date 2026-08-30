package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze2  reason: default package */
/* loaded from: classes.dex */
public final class ze2 implements Comparable {
    public final int A;
    public final int B;
    public final String L;
    public final String R;

    public ze2(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.A = i;
        this.B = i2;
        this.L = str;
        this.R = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ze2 ze2Var = (ze2) obj;
        ze2Var.getClass();
        int i = this.A - ze2Var.A;
        if (i == 0) {
            return this.B - ze2Var.B;
        }
        return i;
    }
}
