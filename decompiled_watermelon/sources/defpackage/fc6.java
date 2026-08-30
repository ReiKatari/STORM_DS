package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fc6  reason: default package */
/* loaded from: classes.dex */
public final class fc6 extends w23 {
    public int A;
    public final /* synthetic */ ec6 B;

    public fc6(ec6 ec6Var) {
        this.B = ec6Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A < this.B.g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w23
    public final int nextInt() {
        int i = this.A;
        this.A = i + 1;
        return this.B.e(i);
    }
}
