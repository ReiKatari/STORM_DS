package defpackage;

import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy0  reason: default package */
/* loaded from: classes.dex */
public final class iy0 extends aj3 implements on2 {
    public static final iy0 L = new iy0(0, 0);
    public static final iy0 R = new iy0(0, 1);
    public static final iy0 X = new iy0(0, 2);
    public static final iy0 Y = new iy0(0, 3);
    public static final iy0 Z = new iy0(0, 4);
    public static final iy0 d0 = new iy0(0, 5);
    public static final iy0 e0 = new iy0(0, 6);
    public static final iy0 f0 = new iy0(0, 7);
    public static final iy0 g0 = new iy0(0, 8);
    public static final iy0 h0 = new iy0(0, 9);
    public static final iy0 i0 = new iy0(0, 10);
    public static final iy0 j0 = new iy0(0, 11);
    public static final iy0 k0 = new iy0(0, 12);
    public static final iy0 l0 = new iy0(0, 13);
    public static final iy0 m0 = new iy0(0, 14);
    public static final iy0 n0 = new iy0(0, 15);
    public static final iy0 o0 = new iy0(0, 16);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy0(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.on2
    public final Object c() {
        switch (this.B) {
            case 0:
            case 1:
                return null;
            case 2:
                ky0.b("LocalTextToolbar");
                throw null;
            case 3:
                ky0.b("LocalUriHandler");
                throw null;
            case 4:
                ky0.b("LocalViewConfiguration");
                throw null;
            case 5:
                ky0.b("LocalWindowInfo");
                throw null;
            case 6:
                return new Handler(Looper.getMainLooper());
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.FALSE;
            case 9:
                return Boolean.FALSE;
            case 10:
                return new sm3(3);
            case 11:
                return new sm3(2);
            case 12:
                return new jj(new PathMeasure());
            case 13:
            case 14:
            case 15:
                return null;
            default:
                return jg7.a;
        }
    }
}
