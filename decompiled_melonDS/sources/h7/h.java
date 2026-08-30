package h7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f6309a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6310b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6311c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6312d;

    public h(int i2, int i10, long j2, long j10) {
        this.f6309a = i2;
        this.f6310b = i10;
        this.f6311c = j2;
        this.f6312d = j10;
    }

    public static h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6309a);
            dataOutputStream.writeInt(this.f6310b);
            dataOutputStream.writeLong(this.f6311c);
            dataOutputStream.writeLong(this.f6312d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f6310b == hVar.f6310b && this.f6311c == hVar.f6311c && this.f6309a == hVar.f6309a && this.f6312d == hVar.f6312d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6310b), Long.valueOf(this.f6311c), Integer.valueOf(this.f6309a), Long.valueOf(this.f6312d));
    }
}
