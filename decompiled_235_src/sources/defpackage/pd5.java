package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pd5  reason: default package */
/* loaded from: classes.dex */
public final class pd5 extends ao4 {
    public final DataInputStream d;

    public pd5(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.d = dataInputStream;
        if (dataInputStream.readUnsignedByte() == 0) {
            this.c = dataInputStream.readInt();
            this.b = -1;
            return;
        }
        throw new e71();
    }

    @Override // defpackage.ao4
    public final void f() {
        if ((this.b & (-16777216)) == 0) {
            this.c = (this.c << 8) | this.d.readUnsignedByte();
            this.b <<= 8;
        }
    }
}
