package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od5  reason: default package */
/* loaded from: classes.dex */
public final class od5 extends ao4 {
    public final byte[] d;
    public int e;

    public od5(mu muVar) {
        byte[] a = muVar.a(65531);
        this.d = a;
        this.e = a.length;
    }

    @Override // defpackage.ao4
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
                throw new e71();
            }
        }
    }
}
