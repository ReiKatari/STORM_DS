package defpackage;

import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mv0  reason: default package */
/* loaded from: classes.dex */
public final class mv0 extends ic3 implements ki2 {
    public static final mv0 L = new mv0(0, 0);
    public static final mv0 R = new mv0(0, 1);
    public static final mv0 X = new mv0(0, 2);
    public static final mv0 Y = new mv0(0, 3);
    public static final mv0 Z = new mv0(0, 4);
    public static final mv0 c0 = new mv0(0, 5);
    public static final mv0 d0 = new mv0(0, 6);
    public static final mv0 e0 = new mv0(0, 7);
    public static final mv0 f0 = new mv0(0, 8);
    public static final mv0 g0 = new mv0(0, 9);
    public static final mv0 h0 = new mv0(0, 10);
    public static final mv0 i0 = new mv0(0, 11);
    public static final mv0 j0 = new mv0(0, 12);
    public static final mv0 k0 = new mv0(0, 13);
    public static final mv0 l0 = new mv0(0, 14);
    public static final mv0 m0 = new mv0(0, 15);
    public static final mv0 n0 = new mv0(0, 16);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv0(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.ki2
    public final Object c() {
        switch (this.B) {
            case 0:
            case 1:
                return null;
            case 2:
                ov0.b("LocalTextToolbar");
                throw null;
            case 3:
                ov0.b("LocalUriHandler");
                throw null;
            case 4:
                ov0.b("LocalViewConfiguration");
                throw null;
            case 5:
                ov0.b("LocalWindowInfo");
                throw null;
            case ig7.b /* 6 */:
                return new Handler(Looper.getMainLooper());
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.FALSE;
            case 9:
                return Boolean.FALSE;
            case 10:
                return new vf3(3);
            case 11:
                return new vf3(2);
            case mj2.L /* 12 */:
                return new xi(new PathMeasure());
            case 13:
            case 14:
            case ig7.e /* 15 */:
                return null;
            default:
                return o27.a;
        }
    }
}
