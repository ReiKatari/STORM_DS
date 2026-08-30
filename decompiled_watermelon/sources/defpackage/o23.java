package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o23  reason: default package */
/* loaded from: classes.dex */
public final class o23 implements p23 {
    public long A;
    public int B;

    @Override // defpackage.p23
    public l23 toInstant() {
        long j = this.A;
        if (j >= l23.L.A && j <= l23.R.A) {
            return hi2.m(this.B, j);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
