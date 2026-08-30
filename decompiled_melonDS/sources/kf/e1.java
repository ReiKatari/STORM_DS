package kf;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(int i2, int i10, cc.c cVar) {
        super(2, cVar);
        this.X = i2;
        this.Y = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((e1) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new e1(this.X, this.Y, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        p7.k.f(16);
        String o02 = vc.h.o0(8, p7.k.A(16, this.X & 4294967295L));
        p7.k.f(16);
        String o03 = vc.h.o0(8, p7.k.A(16, 4294967295L & this.Y));
        URLConnection openConnection = new URL("http://nus.cdn.t.shop.nintendowifi.net/ccs/download/" + o02 + o03 + "/tmd").openConnection();
        openConnection.setConnectTimeout(10000);
        openConnection.setReadTimeout(10000);
        byte[] bArr = new byte[520];
        InputStream inputStream = openConnection.getInputStream();
        try {
            inputStream.read(bArr);
            inputStream.close();
            return bArr;
        } finally {
        }
    }
}
