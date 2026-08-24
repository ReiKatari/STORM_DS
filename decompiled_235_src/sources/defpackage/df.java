package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: df  reason: default package */
/* loaded from: classes.dex */
public final class df implements ViewTranslationCallback {
    public static final df a = new Object();

    public final boolean onClearTranslation(View view) {
        on2 on2Var;
        view.getClass();
        qf contentCaptureManager$ui = ((te) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = lf.SHOW_ORIGINAL;
        g93 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ja4 ja4Var = ((za6) objArr[(i << 3) + i3]).a.d.A;
                            Object g = ja4Var.g(bb6.E);
                            y1 y1Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (g != null) {
                                Object g2 = ja4Var.g(sa6.n);
                                if (g2 != null) {
                                    y1Var = g2;
                                }
                                y1 y1Var2 = y1Var;
                                if (y1Var2 != null && (on2Var = (on2) y1Var2.b) != null) {
                                    Boolean bool = (Boolean) on2Var.c();
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        qn2 qn2Var;
        view.getClass();
        qf contentCaptureManager$ui = ((te) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = lf.SHOW_ORIGINAL;
        g93 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ja4 ja4Var = ((za6) objArr[(i << 3) + i3]).a.d.A;
                            Object g = ja4Var.g(bb6.E);
                            y1 y1Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (nb3.k(g, Boolean.TRUE)) {
                                Object g2 = ja4Var.g(sa6.m);
                                if (g2 != null) {
                                    y1Var = g2;
                                }
                                y1 y1Var2 = y1Var;
                                if (y1Var2 != null && (qn2Var = (qn2) y1Var2.b) != null) {
                                    Boolean bool = (Boolean) qn2Var.g(Boolean.FALSE);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        qn2 qn2Var;
        view.getClass();
        qf contentCaptureManager$ui = ((te) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = lf.SHOW_TRANSLATED;
        g93 c = contentCaptureManager$ui.c();
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ja4 ja4Var = ((za6) objArr[(i << 3) + i3]).a.d.A;
                            Object g = ja4Var.g(bb6.E);
                            y1 y1Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (nb3.k(g, Boolean.FALSE)) {
                                Object g2 = ja4Var.g(sa6.m);
                                if (g2 != null) {
                                    y1Var = g2;
                                }
                                y1 y1Var2 = y1Var;
                                if (y1Var2 != null && (qn2Var = (qn2) y1Var2.b) != null) {
                                    Boolean bool = (Boolean) qn2Var.g(Boolean.TRUE);
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
