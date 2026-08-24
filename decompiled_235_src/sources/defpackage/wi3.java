package defpackage;

import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.RangeCoder;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi3  reason: default package */
/* loaded from: classes.dex */
public final class wi3 extends nc2 {
    public static final int[] B = {262144, 1048576, 2097152, Compress.MAXWINSIZE, Compress.MAXWINSIZE, 8388608, 8388608, RangeCoder.TOP, 33554432, 67108864};
    public int A;

    @Override // defpackage.nc2
    public final InputStream a(InputStream inputStream, mu muVar) {
        return new vi3(inputStream, this.A, muVar);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
