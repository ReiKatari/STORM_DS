package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oe  reason: default package */
/* loaded from: classes.dex */
public final class oe implements ViewTranslationCallback {
    public static final oe a = new Object();

    public final boolean onClearTranslation(View view) {
        ki2 ki2Var;
        view.getClass();
        af contentCaptureManager$ui = ((ee) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = ve.SHOW_ORIGINAL;
        y23 c = contentCaptureManager$ui.c();
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
                            d24 d24Var = ((kz5) objArr[(i << 3) + i3]).a.d.A;
                            Object g = d24Var.g(mz5.E);
                            w1 w1Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (g != null) {
                                Object g2 = d24Var.g(dz5.n);
                                if (g2 != null) {
                                    w1Var = g2;
                                }
                                w1 w1Var2 = w1Var;
                                if (w1Var2 != null && (ki2Var = (ki2) w1Var2.b) != null) {
                                    Boolean bool = (Boolean) ki2Var.c();
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
        mi2 mi2Var;
        view.getClass();
        af contentCaptureManager$ui = ((ee) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = ve.SHOW_ORIGINAL;
        y23 c = contentCaptureManager$ui.c();
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
                            d24 d24Var = ((kz5) objArr[(i << 3) + i3]).a.d.A;
                            Object g = d24Var.g(mz5.E);
                            w1 w1Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (b53.x(g, Boolean.TRUE)) {
                                Object g2 = d24Var.g(dz5.m);
                                if (g2 != null) {
                                    w1Var = g2;
                                }
                                w1 w1Var2 = w1Var;
                                if (w1Var2 != null && (mi2Var = (mi2) w1Var2.b) != null) {
                                    Boolean bool = (Boolean) mi2Var.n(Boolean.FALSE);
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
        mi2 mi2Var;
        view.getClass();
        af contentCaptureManager$ui = ((ee) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.Y = ve.SHOW_TRANSLATED;
        y23 c = contentCaptureManager$ui.c();
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
                            d24 d24Var = ((kz5) objArr[(i << 3) + i3]).a.d.A;
                            Object g = d24Var.g(mz5.E);
                            w1 w1Var = null;
                            if (g == null) {
                                g = null;
                            }
                            if (b53.x(g, Boolean.FALSE)) {
                                Object g2 = d24Var.g(dz5.m);
                                if (g2 != null) {
                                    w1Var = g2;
                                }
                                w1 w1Var2 = w1Var;
                                if (w1Var2 != null && (mi2Var = (mi2) w1Var2.b) != null) {
                                    Boolean bool = (Boolean) mi2Var.n(Boolean.TRUE);
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
