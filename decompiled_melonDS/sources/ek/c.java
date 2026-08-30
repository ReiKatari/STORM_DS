package ek;

import java.io.DataInputStream;
import java.io.InputStream;
import zj.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public final DataInputStream f4510d;

    public c(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f4510d = dataInputStream;
        if (dataInputStream.readUnsignedByte() == 0) {
            this.f4507c = dataInputStream.readInt();
            this.f4506b = -1;
            return;
        }
        throw new g();
    }

    @Override // ek.a
    public final void f() {
        if ((this.f4506b & (-16777216)) == 0) {
            this.f4507c = (this.f4507c << 8) | this.f4510d.readUnsignedByte();
            this.f4506b <<= 8;
        }
    }
}
