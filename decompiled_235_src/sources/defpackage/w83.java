package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w83  reason: default package */
/* loaded from: classes.dex */
public final class w83 implements x83 {
    public long A;
    public int B;

    @Override // defpackage.x83
    public s83 toInstant() {
        long j = this.A;
        if (j >= s83.L.A && j <= s83.R.A) {
            return bl2.A(this.B, j);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
