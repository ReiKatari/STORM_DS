package b4;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements ViewTranslationCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f1853a = new Object();

    public final boolean onClearTranslation(View view) {
        mc.a aVar;
        view.getClass();
        d3.e contentCaptureManager$ui = ((x) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = d3.a.SHOW_ORIGINAL;
        a1.l c4 = contentCaptureManager$ui.c();
        Object[] objArr = c4.f63c;
        long[] jArr = c4.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            a1.m0 m0Var = ((i4.q) objArr[(i2 << 3) + i11]).f6774a.f6770d.A;
                            Object g10 = m0Var.g(i4.t.D);
                            i4.a aVar2 = null;
                            if (g10 == null) {
                                g10 = null;
                            }
                            if (g10 != null) {
                                Object g11 = m0Var.g(i4.l.f6752n);
                                if (g11 != null) {
                                    aVar2 = g11;
                                }
                                i4.a aVar3 = aVar2;
                                if (aVar3 != null && (aVar = (mc.a) aVar3.f6708b) != null) {
                                    Boolean bool = (Boolean) aVar.b();
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return true;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        mc.l lVar;
        view.getClass();
        d3.e contentCaptureManager$ui = ((x) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = d3.a.SHOW_ORIGINAL;
        a1.l c4 = contentCaptureManager$ui.c();
        Object[] objArr = c4.f63c;
        long[] jArr = c4.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            a1.m0 m0Var = ((i4.q) objArr[(i2 << 3) + i11]).f6774a.f6770d.A;
                            Object g10 = m0Var.g(i4.t.D);
                            i4.a aVar = null;
                            if (g10 == null) {
                                g10 = null;
                            }
                            if (nc.k.a(g10, Boolean.TRUE)) {
                                Object g11 = m0Var.g(i4.l.m);
                                if (g11 != null) {
                                    aVar = g11;
                                }
                                i4.a aVar2 = aVar;
                                if (aVar2 != null && (lVar = (mc.l) aVar2.f6708b) != null) {
                                    Boolean bool = (Boolean) lVar.k(Boolean.FALSE);
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return true;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        mc.l lVar;
        view.getClass();
        d3.e contentCaptureManager$ui = ((x) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = d3.a.SHOW_TRANSLATED;
        a1.l c4 = contentCaptureManager$ui.c();
        Object[] objArr = c4.f63c;
        long[] jArr = c4.f61a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            a1.m0 m0Var = ((i4.q) objArr[(i2 << 3) + i11]).f6774a.f6770d.A;
                            Object g10 = m0Var.g(i4.t.D);
                            i4.a aVar = null;
                            if (g10 == null) {
                                g10 = null;
                            }
                            if (nc.k.a(g10, Boolean.FALSE)) {
                                Object g11 = m0Var.g(i4.l.m);
                                if (g11 != null) {
                                    aVar = g11;
                                }
                                i4.a aVar2 = aVar;
                                if (aVar2 != null && (lVar = (mc.l) aVar2.f6708b) != null) {
                                    Boolean bool = (Boolean) lVar.k(Boolean.TRUE);
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return true;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
