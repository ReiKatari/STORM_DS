package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f45  reason: default package */
/* loaded from: classes.dex */
public final class f45 extends ze4 {
    public final DataInputStream d;

    public f45(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.d = dataInputStream;
        if (dataInputStream.readUnsignedByte() == 0) {
            this.c = dataInputStream.readInt();
            this.b = -1;
            return;
        }
        throw new w31();
    }

    @Override // defpackage.ze4
    public final void f() {
        if ((this.b & (-16777216)) == 0) {
            this.c = (this.c << 8) | this.d.readUnsignedByte();
            this.b <<= 8;
        }
    }
}
