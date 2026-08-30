package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p43  reason: default package */
/* loaded from: classes.dex */
public final class p43 {
    public final int a;
    public final int b;
    public final xi3 c;

    public p43(int i, int i2, xi3 xi3Var) {
        this.a = i;
        this.b = i2;
        this.c = xi3Var;
        if (i < 0) {
            pz2.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        pz2.a("size should be > 0");
    }
}
