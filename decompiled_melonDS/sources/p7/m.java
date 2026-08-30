package p7;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p8.b0;
import p8.c0;
import p8.e0;
import p8.w;
import p8.x;
import q1.a0;
import w.l0;
import w.z;
import yb.y;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11421a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11422b = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.lifecycle.d0, androidx.lifecycle.f0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [p8.x, java.lang.Object] */
    public static final x A(x xVar, String str, Executor executor, mc.a aVar) {
        xVar.getClass();
        executor.getClass();
        ?? d0Var = new d0(x.f11512c);
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = w.d.class;
        try {
            executor.execute(new b0(xVar, str, aVar, (f0) d0Var, (b5.i) obj));
            obj.f2051a = y.f14813a;
        } catch (Exception e6) {
            lVar.b(e6);
        }
        return new Object();
    }

    public static pi.q B(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 == 0) {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            int length = strArr3.length;
            int i2 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                if (strArr3[i10] != null) {
                    strArr3[i10] = vc.h.C0(strArr2[i10]).toString();
                } else {
                    a0.j.h("Headers cannot be null");
                    return null;
                }
            }
            int E = a.a.E(0, strArr3.length - 1, 2);
            if (E >= 0) {
                while (true) {
                    String str = strArr3[i2];
                    String str2 = strArr3[i2 + 1];
                    t.r(str);
                    t.s(str2, str);
                    if (i2 == E) {
                        break;
                    }
                    i2 += 2;
                }
            }
            return new pi.q(strArr3);
        }
        a0.j.h("Expected alternating header names and values");
        return null;
    }

    public static void C(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static final rg.d D(n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        if (L == n2.l.f9953a) {
            L = new rg.d();
            rVar.h0(L);
        }
        return (rg.d) L;
    }

    public static void E(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z11 = false;
        int i2 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (hasOnClickListeners || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    public static final int F(e0 e0Var) {
        e0Var.getClass();
        switch (x8.x.f14450a[e0Var.ordinal()]) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case l1.c.f8511g /* 5 */:
                return 4;
            case l1.c.f8509e /* 6 */:
                return 5;
            default:
                m9.o.o();
                return 0;
        }
    }

    public static void G(j0.m mVar, ArrayList arrayList) {
        if (mVar instanceof j0.n) {
            ArrayList arrayList2 = ((j0.n) mVar).f7267a;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                G((j0.m) obj, arrayList);
            }
        } else if (mVar instanceof l0) {
            arrayList.add(((l0) mVar).f13995a);
        } else {
            arrayList.add(new z(mVar));
        }
    }

    public static final y8.f H(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT >= 28 && bArr.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i2 = 0; i2 < readInt; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i10 = 0; i10 < readInt2; i10++) {
                    iArr2[i10] = objectInputStream.readInt();
                }
                y8.f c4 = y8.g.c(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return c4;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    l0.f.f(byteArrayInputStream, th2);
                    throw th3;
                }
            }
        }
        return new y8.f(null);
    }

    public static final long a(float f8, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final q4.x r28, final mc.l r29, final b3.p r30, boolean r31, l4.r0 r32, final mc.p r33, final mc.p r34, final boolean r35, q4.g0 r36, final u1.o0 r37, u1.n0 r38, boolean r39, int r40, int r41, i3.n0 r42, final g2.d1 r43, n2.m r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.m.b(q4.x, mc.l, b3.p, boolean, l4.r0, mc.p, mc.p, boolean, q4.g0, u1.o0, u1.n0, boolean, int, int, i3.n0, g2.d1, n2.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r17, rg.d r18, mc.l r19, mc.a r20, n2.m r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.m.c(java.lang.String, rg.d, mc.l, mc.a, n2.m, int, int):void");
    }

    public static void d(StringBuilder sb2, Object obj, mc.l lVar) {
        boolean z10;
        if (lVar != null) {
            sb2.append((CharSequence) lVar.k(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final LinkedHashSet f(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i2 = 0; i2 < readInt; i2++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new p8.d(readBoolean, parse));
                    }
                    objectInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        l0.f.f(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                l0.f.f(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    public static void g(String str, boolean z10) {
        if (z10) {
            return;
        }
        a0.j.h(str);
    }

    public static void h(boolean z10) {
        if (z10) {
            return;
        }
        fj.j.b();
    }

    public static void i(String str, int i2, int i10, int i11) {
        if (i2 >= i10) {
            if (i2 <= i11) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too low)");
    }

    public static void j(int i2) {
        if (i2 >= 0) {
            return;
        }
        fj.j.b();
    }

    public static final void k(int i2, int i10) {
        if (i2 >= 0 && i2 < i10) {
            return;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        m9.o.i(str);
    }

    public static final void m(int i2, int i10) {
        if (i2 >= 0 && i2 <= i10) {
            return;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
    }

    public static final void n(int i2, int i10, int i11) {
        if (i2 >= 0 && i10 <= i11) {
            if (i2 <= i10) {
                return;
            }
            a0.j.h(kc.a.d(i2, i10, "fromIndex: ", " > toIndex: "));
            return;
        }
        a0.j.l(kc.a.j("fromIndex: ", i2, ", toIndex: ", i10, ", size: "), i11);
    }

    public static void o(String str, boolean z10) {
        if (z10) {
            return;
        }
        a0.j.p(str);
    }

    public static final int p(t7.c cVar, String str) {
        cVar.getClass();
        int columnCount = cVar.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 < columnCount) {
                if (str.equals(cVar.getColumnName(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        String c4 = kc.a.c('`', "`", str);
        int columnCount2 = cVar.getColumnCount();
        int i10 = 0;
        while (true) {
            if (i10 < columnCount2) {
                if (c4.equals(cVar.getColumnName(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = cVar.getColumnCount();
            String concat = ".".concat(str);
            String c10 = kc.a.c('`', ".", str);
            for (int i11 = 0; i11 < columnCount3; i11++) {
                String columnName = cVar.getColumnName(i11);
                if (columnName.length() >= str.length() + 2 && (vc.o.O(columnName, concat, false) || (columnName.charAt(0) == '`' && vc.o.O(columnName, c10, false)))) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public static ImageView.ScaleType q(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static final long r(a0 a0Var) {
        return pc.a.N(a0Var.l() * a0Var.p()) + (a0Var.k() * a0Var.p());
    }

    public static final int s(t7.c cVar, String str) {
        cVar.getClass();
        return p(cVar, str);
    }

    public static final int t(t7.c cVar, String str) {
        cVar.getClass();
        int p10 = p(cVar, str);
        if (p10 >= 0) {
            return p10;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(cVar.getColumnName(i2));
        }
        m9.o.t("Column '", str, "' does not exist. Available columns: [", zb.l.Y(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final p8.a u(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return p8.a.LINEAR;
            }
            a0.j.h(w.d.m("Could not convert ", i2, " to BackoffPolicy"));
            return null;
        }
        return p8.a.EXPONENTIAL;
    }

    public static final w v(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i2 == 5) {
                                return w.TEMPORARILY_UNMETERED;
                            }
                            a0.j.h(w.d.m("Could not convert ", i2, " to NetworkType"));
                            return null;
                        }
                        return w.METERED;
                    }
                    return w.NOT_ROAMING;
                }
                return w.UNMETERED;
            }
            return w.CONNECTED;
        }
        return w.NOT_REQUIRED;
    }

    public static final c0 w(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return c0.DROP_WORK_REQUEST;
            }
            a0.j.h(w.d.m("Could not convert ", i2, " to OutOfQuotaPolicy"));
            return null;
        }
        return c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static final e0 x(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return e0.CANCELLED;
                            }
                            a0.j.h(w.d.m("Could not convert ", i2, " to State"));
                            return null;
                        }
                        return e0.BLOCKED;
                    }
                    return e0.FAILED;
                }
                return e0.SUCCEEDED;
            }
            return e0.RUNNING;
        }
        return e0.ENQUEUED;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [uc.g, java.lang.Object, cc.c] */
    public static uc.g y(mc.p pVar) {
        ?? obj = new Object();
        obj.R = pc.a.q(pVar, obj, obj);
        return obj;
    }

    public static final void z(String str) {
        str.getClass();
        throw new IllegalArgumentException(kc.a.g("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
