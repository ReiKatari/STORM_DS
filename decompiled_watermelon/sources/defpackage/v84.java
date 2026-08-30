package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v84  reason: default package */
/* loaded from: classes.dex */
public final class v84 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v84(int i, int i2, j11 j11Var) {
        super(2, j11Var);
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((v84) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new v84(this.X, this.Y, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        String H0 = zg6.H0(8, nl2.Z(this.X));
        String H02 = zg6.H0(8, nl2.Z(this.Y));
        URLConnection openConnection = new URL("http://nus.cdn.t.shop.nintendowifi.net/ccs/download/" + H0 + H02 + "/tmd").openConnection();
        openConnection.setConnectTimeout(10000);
        openConnection.setReadTimeout(10000);
        InputStream inputStream = openConnection.getInputStream();
        try {
            inputStream.getClass();
            byte[] z = pu.z(inputStream);
            inputStream.close();
            if (z.length >= 520) {
                return Arrays.copyOf(z, 520);
            }
            throw new EOFException(wh1.j("TMD response is too small: ", z.length, " bytes"));
        } finally {
        }
    }
}
