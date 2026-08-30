package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e45  reason: default package */
/* loaded from: classes.dex */
public final class e45 extends ze4 {
    public final byte[] d;
    public int e;

    public e45(ut utVar) {
        byte[] a = utVar.a(65531);
        this.d = a;
        this.e = a.length;
    }

    @Override // defpackage.ze4
    public final void f() {
        int i = this.b;
        if (((-16777216) & i) == 0) {
            try {
                byte[] bArr = this.d;
                int i2 = this.e;
                this.e = i2 + 1;
                this.c = (this.c << 8) | (bArr[i2] & 255);
                this.b = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new w31();
            }
        }
    }
}
