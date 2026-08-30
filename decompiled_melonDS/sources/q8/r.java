package q8;

import a4.o0;
import ah.h0;
import ai.r0;
import ai.s0;
import ai.v0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.system.Os;
import android.text.Layout;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.work.impl.WorkDatabase;
import cd.z0;
import d0.b1;
import g2.n0;
import h1.n1;
import j0.d0;
import j0.j0;
import j0.o2;
import java.io.File;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k7.m0;
import l1.r1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.p1;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r implements n4.d {
    public static final /* synthetic */ int A = 0;
    public static i3.f B;
    public static i3.b L;
    public static k3.b R;
    public static final /* synthetic */ int X = 0;
    public static o3.f Y;
    public static b9.e Z;

    /* JADX WARN: Can't wrap try/catch for region: R(10:46|(4:48|49|50|(8:52|(1:56)|57|58|(1:61)|64|(2:66|(1:68)(1:70))(2:71|72)|(2:17|18)(8:19|(1:21)|22|(1:24)(1:37)|25|(1:27)|28|(2:30|(2:32|33)(2:34|35))(1:36))))(1:80)|77|(2:54|56)|57|58|(1:73)(1:61)|64|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0141, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
        r2 = null;
        r16 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133 A[Catch: Exception -> 0x0141, TryCatch #2 {Exception -> 0x0141, blocks: (B:41:0x00e8, B:45:0x0121, B:46:0x0128, B:48:0x0133, B:50:0x013c), top: B:82:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A(android.content.Context r18, android.net.Uri r19) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.r.A(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static b6.f B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new b6.f(1, a6.q.b(view));
        }
        return null;
    }

    public static final cc.g C(k7.t tVar, boolean z10, ec.c cVar) {
        cc.g gVar;
        k7.z zVar = (k7.z) cVar.g().t(k7.z.B);
        if (zVar != null) {
            gVar = zVar.A;
        } else {
            gVar = null;
        }
        if (tVar.k()) {
            if (gVar != null) {
                h0 h0Var = tVar.f8073a;
                if (h0Var != null) {
                    return h0Var.B.H(gVar);
                }
                nc.k.f("coroutineScope");
                throw null;
            } else if (z10) {
                cc.g gVar2 = tVar.f8074b;
                if (gVar2 != null) {
                    return gVar2;
                }
                nc.k.f("transactionContext");
                throw null;
            } else {
                h0 h0Var2 = tVar.f8073a;
                if (h0Var2 != null) {
                    return h0Var2.B;
                }
                nc.k.f("coroutineScope");
                throw null;
            }
        }
        h0 h0Var3 = tVar.f8073a;
        if (h0Var3 != null) {
            cc.g gVar3 = h0Var3.B;
            if (gVar == null) {
                gVar = cc.h.A;
            }
            return gVar3.H(gVar);
        }
        nc.k.f("coroutineScope");
        throw null;
    }

    public static final float D(Layout layout, int i2, Paint paint) {
        int i10;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = m4.l.f9232a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        int lineStart = layout.getLineStart(i2);
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + lineStart) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if (paragraphAlignment == null) {
            i10 = -1;
        } else {
            i10 = o4.d.f10832a[paragraphAlignment.ordinal()];
        }
        if (i10 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float E(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = m4.l.f9232a;
        if (layout.getEllipsisCount(i2) > 0) {
            int i10 = -1;
            if (layout.getParagraphDirection(i2) == -1 && layout.getWidth() < layout.getLineRight(i2)) {
                float primaryHorizontal = layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2));
                float measureText = paint.measureText("…") + (layout.getLineRight(i2) - primaryHorizontal);
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
                if (paragraphAlignment != null) {
                    i10 = o4.d.f10832a[paragraphAlignment.ordinal()];
                }
                if (i10 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i2);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i2);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static final Class F(nc.e eVar) {
        eVar.getClass();
        Class a10 = eVar.a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a10;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a10;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a10;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a10;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a10;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a10;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a10;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a10;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a10;
            default:
                return a10;
        }
    }

    public static final int G(Layout layout, int i2, boolean z10) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z10) {
                    return lineForOffset - 1;
                }
            } else if (!z10) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final boolean H(h3.d dVar) {
        long j2 = dVar.f6060e;
        if ((j2 >>> 32) == (4294967295L & j2) && j2 == dVar.f6061f && j2 == dVar.f6062g && j2 == dVar.f6063h) {
            return true;
        }
        return false;
    }

    public static final int J(o1.o oVar, n1 n1Var) {
        long j2;
        if (n1Var == n1.Vertical) {
            j2 = oVar.f10573o & 4294967295L;
        } else {
            j2 = oVar.f10573o >> 32;
        }
        return (int) j2;
    }

    public static final Object K(k7.t tVar, boolean z10, boolean z11, mc.l lVar) {
        k7.z zVar;
        tVar.getClass();
        ThreadLocal threadLocal = tVar.f8081i;
        tVar.a();
        if (tVar.k() && !tVar.l()) {
            cc.g gVar = (cc.g) threadLocal.get();
            if (gVar != null) {
                zVar = (k7.z) gVar.t(k7.z.B);
            } else {
                zVar = null;
            }
            if (zVar != null) {
                a0.j.p("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        cc.g gVar2 = (cc.g) threadLocal.get();
        if (gVar2 == null) {
            gVar2 = cc.h.A;
        }
        return a.a.V(new p7.e(gVar2, tVar, z11, z10, lVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r10 == r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(k7.t r8, mc.l r9, ec.c r10) {
        /*
            boolean r0 = r10 instanceof p7.f
            if (r0 == 0) goto L13
            r0 = r10
            p7.f r0 = (p7.f) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            p7.f r0 = new p7.f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            p7.j.I(r10)
            return r10
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L38:
            ec.j r8 = r0.X
            r9 = r8
            mc.l r9 = (mc.l) r9
            k7.t r8 = r0.R
            p7.j.I(r10)
            goto L97
        L43:
            p7.j.I(r10)
            return r10
        L47:
            p7.j.I(r10)
            return r10
        L4b:
            p7.j.I(r10)
            boolean r10 = r8.k()
            if (r10 == 0) goto L64
            b2.c r10 = new b2.c
            r2 = 4
            r10.<init>(r8, r9, r7, r2)
            r0.Z = r6
            java.lang.Object r8 = d0.d.m0(r0, r8, r10)
            if (r8 != r1) goto L63
            goto Laa
        L63:
            return r8
        L64:
            boolean r10 = r8.k()
            if (r10 == 0) goto L87
            boolean r10 = r8.n()
            if (r10 == 0) goto L87
            boolean r10 = r8.l()
            if (r10 == 0) goto L87
            p7.g r10 = new p7.g
            r2 = 1
            r10.<init>(r8, r7, r9, r2)
            r0.Z = r5
            r9 = 0
            java.lang.Object r8 = r8.q(r9, r10, r0)
            if (r8 != r1) goto L86
            goto Laa
        L86:
            return r8
        L87:
            r0.R = r8
            r10 = r9
            ec.j r10 = (ec.j) r10
            r0.X = r10
            r0.Z = r4
            cc.g r10 = C(r8, r6, r0)
            if (r10 != r1) goto L97
            goto Laa
        L97:
            cc.g r10 = (cc.g) r10
            mh.m r2 = new mh.m
            r2.<init>(r7, r8, r9)
            r0.R = r7
            r0.X = r7
            r0.Z = r3
            java.lang.Object r8 = zc.x.F(r10, r2, r0)
            if (r8 != r1) goto Lab
        Laa:
            return r1
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.r.L(k7.t, mc.l, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(cc.c r14, k7.t r15, boolean r16, boolean r17, mc.l r18) {
        /*
            boolean r0 = r14 instanceof p7.h
            if (r0 == 0) goto L14
            r0 = r14
            p7.h r0 = (p7.h) r0
            int r1 = r0.f11417c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f11417c0 = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            p7.h r0 = new p7.h
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.f11416b0
            dc.a r7 = dc.a.COROUTINE_SUSPENDED
            int r1 = r14.f11417c0
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L4a
            if (r1 == r8) goto L46
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            p7.j.I(r0)
            return r0
        L2f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r14)
            r14 = 0
            return r14
        L36:
            boolean r1 = r14.Z
            boolean r3 = r14.Y
            mc.l r4 = r14.X
            k7.t r5 = r14.R
            p7.j.I(r0)
            r12 = r1
            r11 = r3
            r13 = r4
            r10 = r5
            goto L95
        L46:
            p7.j.I(r0)
            return r0
        L4a:
            p7.j.I(r0)
            boolean r0 = r15.k()
            if (r0 == 0) goto L79
            boolean r0 = r15.n()
            if (r0 == 0) goto L79
            boolean r0 = r15.l()
            if (r0 == 0) goto L79
            p7.c r0 = new p7.c
            r4 = 0
            r6 = 1
            r3 = r15
            r2 = r16
            r1 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r14.f11417c0 = r8
            java.lang.Object r14 = r15.q(r1, r2, r14)
            if (r14 != r7) goto L78
            goto Laa
        L78:
            return r14
        L79:
            r1 = r16
            r4 = r17
            r14.R = r15
            r5 = r18
            r14.X = r5
            r14.Y = r1
            r14.Z = r4
            r14.f11417c0 = r3
            cc.g r3 = C(r15, r4, r14)
            if (r3 != r7) goto L90
            goto Laa
        L90:
            r10 = r15
            r11 = r1
            r0 = r3
            r12 = r4
            r13 = r5
        L95:
            cc.g r0 = (cc.g) r0
            p7.d r8 = new p7.d
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r1 = 0
            r14.R = r1
            r14.X = r1
            r14.f11417c0 = r2
            java.lang.Object r14 = zc.x.F(r0, r8, r14)
            if (r14 != r7) goto Lab
        Laa:
            return r7
        Lab:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.r.M(cc.c, k7.t, boolean, boolean, mc.l):java.lang.Object");
    }

    public static final String Q(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static final void R(Object[] objArr, int i2, int i10) {
        objArr.getClass();
        while (i2 < i10) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static void S(Window window, boolean z10) {
        int i2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            a6.l.h(window, z10);
        } else if (i10 >= 30) {
            a6.l.g(window, z10);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z10) {
                i2 = systemUiVisibility & (-1793);
            } else {
                i2 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i2);
        }
    }

    public static void T(i5.b bVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + bVar.f6815b;
        try {
            int i2 = g5.a.f5561a[bVar.f6816c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z10 = true;
            switch (i2) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int o5 = o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int o8 = o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((o5 << 16) | (o((int) (fArr[3] * 255.0f)) << 24) | (o8 << 8) | o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (o((int) (fArr[3] * 255.0f)) << 24) | (o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case l1.c.f8511g /* 5 */:
                    throw new RuntimeException("unable to interpolate strings " + bVar.f6815b);
                case l1.c.f8509e /* 6 */:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z10));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e6) {
            StringBuilder u4 = w.d.u("Cannot access method ", str, " on View \"");
            u4.append(d0.d.W(view));
            u4.append("\"");
            Log.e("CustomSupport", u4.toString(), e6);
        } catch (NoSuchMethodException e10) {
            StringBuilder u10 = w.d.u("No method ", str, " on View \"");
            u10.append(d0.d.W(view));
            u10.append("\"");
            Log.e("CustomSupport", u10.toString(), e10);
        } catch (InvocationTargetException e11) {
            StringBuilder u11 = w.d.u("Cannot invoke method ", str, " on View \"");
            u11.append(d0.d.W(view));
            u11.append("\"");
            Log.e("CustomSupport", u11.toString(), e11);
        }
    }

    public static final void V(j0.b0 b0Var, b1 b1Var, f0.c cVar) {
        boolean z10;
        n0.b r5;
        b9.e eVar = Z;
        if (eVar != null) {
            String d4 = b0Var.d();
            d4.getClass();
            d0 b10 = ((j0) eVar.B).b(d4);
            j0.c cVar2 = new j0.c(b10.k(), j0.y.f7326a);
            d0.z zVar = d0.z.R;
            n0.f fVar = new n0.f(b10, null, cVar2, null, zVar, zVar, (b0.a) eVar.L, (jb.c) eVar.X, (o2) eVar.R);
            synchronized (fVar.f9729e0) {
            }
            List list = (List) b1Var.f3332b;
            synchronized (fVar.f9729e0) {
                fVar.f9726b0 = list;
            }
            synchronized (fVar.f9729e0) {
            }
            Range range = (Range) b1Var.f3335e;
            synchronized (fVar.f9729e0) {
                fVar.f9727c0 = range;
            }
            List list2 = (List) b1Var.f3334d;
            aj.g.o("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + cVar);
            synchronized (fVar.f9729e0) {
                j0.d dVar = fVar.A;
                j0.v vVar = fVar.f9728d0;
                dVar.m(vVar);
                j0.d dVar2 = fVar.B;
                if (dVar2 != null) {
                    dVar2.m(vVar);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(fVar.X);
                linkedHashSet.addAll(list2);
                HashMap n10 = n0.f.n(linkedHashSet, cVar);
                try {
                    if (fVar.B != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r5 = fVar.r(linkedHashSet, z10);
                    n0.f.D(n10);
                } catch (IllegalArgumentException e6) {
                    throw new Exception(e6);
                }
            }
            r5.getClass();
            return;
        }
        a0.j.p("mCameraUseCaseAdapterProvider must be initialized first!");
    }

    public static final void a(b3.p pVar, oi.b bVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        pVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-835742261);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(bVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            boolean f8 = rVar.f(bVar);
            Object L2 = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (f8 || L2 == eVar) {
                L2 = n2.s.w(oh.e.SHOW_ICON);
                rVar.h0(L2);
            }
            w0 w0Var = (w0) L2;
            boolean f10 = rVar.f(w0Var);
            Object L3 = rVar.L();
            if (f10 || L3 == eVar) {
                L3 = new oh.a(w0Var, null, 0);
                rVar.h0(L3);
            }
            n2.s.g(bVar, (mc.p) L3, rVar);
            float f11 = 8;
            n0.b(r1.m(f3.g.h(l1.c.t(pVar, 16), f11, t1.e.b(f11), 0L, 28), 0.0f, 400, 1), t1.e.b(f11), 0L, v2.h.c(491987464, new r0(21, bVar, w0Var), rVar), rVar, 1572864, 60);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r0(pVar, bVar, i2, 22);
        }
    }

    public static final void b(mh.c cVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(60908354);
        if (rVar.h(cVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            Object L2 = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L2 == eVar) {
                L2 = n2.s.w(nh.a.SHOW_START_MESSAGE);
                rVar.h0(L2);
            }
            w0 w0Var = (w0) L2;
            Object L3 = rVar.L();
            if (L3 == eVar) {
                L3 = d1.d.a(1.0f);
                rVar.h0(L3);
            }
            d1.c cVar2 = (d1.c) L3;
            boolean h2 = rVar.h(cVar2);
            Object L4 = rVar.L();
            if (h2 || L4 == eVar) {
                L4 = new nh.c(cVar2, w0Var, null, 0);
                rVar.h0(L4);
            }
            n2.s.g(yb.y.f14813a, (mc.p) L4, rVar);
            b3.p t5 = l1.c.t(b3.m.f1770a, 8);
            boolean h10 = rVar.h(cVar2);
            Object L5 = rVar.L();
            if (h10 || L5 == eVar) {
                L5 = new nh.b(cVar2, 0);
                rVar.h0(L5);
            }
            l0.f.a(i3.z.m(t5, (mc.l) L5), cVar.f9674b, cVar.f9676d, v2.h.c(-2108253699, new v0(7, w0Var, cVar), rVar), rVar, 3072);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new s0(i2, 18, cVar);
        }
    }

    public static final h3.d d(float f8, float f10, float f11, float f12, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new h3.d(f8, f10, f11, f12, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final String f(Object[] objArr, int i2, int i10, zb.f fVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i2 + i11];
            if (obj == fVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static final Object k(a4.j jVar, mc.a aVar, ec.c cVar) {
        f4.a aVar2;
        a4.r1 s10;
        Object l10;
        a4.n1 n1Var;
        b3.o oVar = (b3.o) jVar;
        boolean z10 = oVar.A.f1777h0;
        if (z10) {
            if (!z10) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            b3.o oVar2 = oVar.A.X;
            o0 t5 = a4.l.t(jVar);
            loop0: while (true) {
                aVar2 = null;
                if (t5 == null) {
                    break;
                }
                if ((t5.A0.f268f.R & 524288) != 0) {
                    while (oVar2 != null) {
                        if ((oVar2.L & 524288) != 0) {
                            b3.o oVar3 = oVar2;
                            p2.b bVar = null;
                            while (oVar3 != null) {
                                if (oVar3 instanceof f4.a) {
                                    aVar2 = oVar3;
                                    break loop0;
                                }
                                if ((oVar3.L & 524288) != 0 && (oVar3 instanceof a4.k)) {
                                    int i2 = 0;
                                    for (b3.o oVar4 = ((a4.k) oVar3).f247j0; oVar4 != null; oVar4 = oVar4.Y) {
                                        if ((oVar4.L & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar3 = oVar4;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar3 != null) {
                                                    bVar.b(oVar3);
                                                    oVar3 = null;
                                                }
                                                bVar.b(oVar4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar3 = a4.l.e(bVar);
                            }
                            continue;
                        }
                        oVar2 = oVar2.X;
                    }
                }
                t5 = t5.u();
                if (t5 != null && (n1Var = t5.A0) != null) {
                    oVar2 = n1Var.f267e;
                } else {
                    oVar2 = null;
                }
            }
            f4.a aVar3 = aVar2;
            if (aVar3 != null && (l10 = aVar3.l((s10 = a4.l.s(jVar)), new a4.n0(8, aVar, s10), cVar)) == dc.a.COROUTINE_SUSPENDED) {
                return l10;
            }
        }
        return yb.y.f14813a;
    }

    public static int o(int i2) {
        int i10 = (i2 & (~(i2 >> 31))) - 255;
        return (i10 & (i10 >> 31)) + 255;
    }

    public static final void q(t7.c cVar, Throwable th2) {
        boolean isTerminated;
        if (cVar != null) {
            if (th2 == null) {
                if (cVar instanceof AutoCloseable) {
                    cVar.close();
                    return;
                } else if (cVar instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) cVar;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z10 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z10) {
                                    executorService.shutdownNow();
                                    z10 = true;
                                }
                            }
                        }
                        if (z10) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (cVar instanceof TypedArray) {
                    ((TypedArray) cVar).recycle();
                    return;
                } else if (cVar instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cVar).release();
                    return;
                } else if (cVar instanceof MediaDrm) {
                    ((MediaDrm) cVar).release();
                    return;
                } else {
                    fj.j.b();
                    return;
                }
            }
            try {
                kc.a.p(cVar);
            } catch (Throwable th3) {
                p7.t.a(th2, th3);
            }
        }
    }

    public static final m7.j r(k7.t tVar, boolean z10, String[] strArr, mc.l lVar) {
        yb.j jVar;
        k7.g g10 = tVar.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        m0 m0Var = g10.f8009b;
        m0Var.getClass();
        ac.h hVar = new ac.h();
        int i2 = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = m0Var.f8044c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                hVar.addAll(set);
            } else {
                hVar.add(str);
            }
        }
        String[] strArr3 = (String[]) p7.j.d(hVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i2 < length) {
                String str2 = strArr3[i2];
                LinkedHashMap linkedHashMap2 = m0Var.f8047f;
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) linkedHashMap2.get(lowerCase2);
                if (num != null) {
                    iArr[i2] = num.intValue();
                    i2++;
                } else {
                    a0.j.h("There is no table with name ".concat(str2));
                    jVar = null;
                    break;
                }
            } else {
                jVar = new yb.j(strArr3, iArr);
                break;
            }
        }
        String[] strArr4 = (String[]) jVar.A;
        int[] iArr2 = (int[]) jVar.B;
        strArr4.getClass();
        iArr2.getClass();
        return new m7.j(cd.q.g(new z0(new a9.d(m0Var, iArr2, strArr4, (cc.c) null, 18)), -1), tVar, z10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, a7.m0] */
    public static final a7.d0 s(Context context) {
        context.getClass();
        a7.d0 d0Var = new a7.d0(context);
        d7.f fVar = d0Var.f552b;
        a7.n0 n0Var = fVar.f3938s;
        n0Var.a(new a7.c0(n0Var));
        a7.n0 n0Var2 = fVar.f3938s;
        n0Var2.a(new b7.i());
        n0Var2.a(new Object());
        return d0Var;
    }

    public static final p u(Context context, p8.b bVar) {
        k7.q q10;
        context.getClass();
        z8.a aVar = new z8.a(bVar.f11454c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        k7.a0 a0Var = aVar.f14969a;
        a0Var.getClass();
        p8.x xVar = bVar.f11455d;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        xVar.getClass();
        if (z10) {
            q10 = new k7.q(applicationContext, WorkDatabase.class, null);
            q10.f8063i = true;
        } else {
            q10 = aj.g.q(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            q10.f8062h = new ah.e(11, applicationContext);
        }
        q10.f8060f = a0Var;
        q10.f8058d.add(new k7.p(xVar));
        q10.a(b.f12318h);
        q10.a(new e(applicationContext, 2, 3));
        q10.a(b.f12319i);
        q10.a(b.f12320j);
        q10.a(new e(applicationContext, 5, 6));
        q10.a(b.f12321k);
        q10.a(b.f12322l);
        q10.a(b.m);
        q10.a(new e(applicationContext));
        q10.a(new e(applicationContext, 10, 11));
        q10.a(b.f12314d);
        q10.a(b.f12315e);
        q10.a(b.f12316f);
        q10.a(b.f12317g);
        q10.a(new e(applicationContext, 21, 22));
        q10.f8069p = false;
        q10.f8070q = true;
        q10.f8071r = true;
        WorkDatabase workDatabase = (WorkDatabase) q10.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        v8.j jVar = new v8.j(applicationContext2, aVar);
        d dVar = new d(context.getApplicationContext(), bVar, aVar, workDatabase);
        return new p(context.getApplicationContext(), bVar, aVar, workDatabase, (List) q.f12381b0.d(context, bVar, aVar, workDatabase, jVar, dVar), dVar, jVar);
    }

    public static final void v(t7.a aVar) {
        aVar.getClass();
        ac.b g10 = p7.t.g();
        t7.c T = aVar.T("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (T.N()) {
            try {
                g10.add(T.n(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    q(T, th2);
                    throw th3;
                }
            }
        }
        q(T, null);
        ListIterator listIterator = p7.t.d(g10).listIterator(0);
        while (true) {
            a4.r rVar = (a4.r) listIterator;
            if (rVar.hasNext()) {
                String str = (String) rVar.next();
                if (vc.o.V(str, "room_fts_content_sync_", false)) {
                    zb.k.r(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static void w(Window window) {
        int i2;
        int i10;
        Objects.requireNonNull(window);
        window.getDecorView();
        S(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if (i11 >= 30) {
                i2 = 3;
            } else {
                i2 = 1;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            i10 = attributes.layoutInDisplayCutoutMode;
            if (i10 != i2) {
                attributes.layoutInDisplayCutoutMode = i2;
                window.setAttributes(attributes);
            }
        }
        if (i11 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static final fc.b x(Enum[] enumArr) {
        enumArr.getClass();
        return new fc.b(enumArr);
    }

    public static String y(Context context, Uri uri) {
        String substring;
        if (uri != null) {
            String uri2 = uri.toString();
            uri2.getClass();
            int h02 = vc.h.h0(uri2, "://", 0, false, 6);
            if (h02 == -1) {
                substring = null;
            } else {
                sc.d L2 = p7.j.L(0, h02);
                L2.getClass();
                substring = uri2.substring(L2.A, L2.B + 1);
            }
            if (nc.k.a(substring, "content")) {
                boolean isDocumentUri = DocumentsContract.isDocumentUri(context, uri);
                try {
                    if (isDocumentUri) {
                        return z(context, uri);
                    }
                    return A(context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
                } catch (Exception unused) {
                    if (isDocumentUri) {
                        return k6.a.d(context, uri).f();
                    }
                    return k6.a.e(context, uri).f();
                }
            } else if (nc.k.a(substring, "file")) {
                String uri3 = uri.toString();
                uri3.getClass();
                return uri3.substring(vc.h.h0(uri3, "://", 0, false, 6) + 3);
            }
        }
        return null;
    }

    public static String z(Context context, Uri uri) {
        uri.getClass();
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor != null) {
                int fd = openFileDescriptor.getFd();
                String readlink = Os.readlink(new File("/proc/self/fd/" + fd).getAbsolutePath());
                openFileDescriptor.close();
                return readlink;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract int I(int i2);

    public abstract int N(int i2);

    public abstract void O(b5.g gVar, b5.g gVar2);

    public abstract void P(b5.g gVar, Thread thread);

    public abstract void U(d.c0 c0Var, d.c0 c0Var2, Window window, View view, boolean z10, boolean z11);

    @Override // n4.d
    public int c(int i2) {
        return N(i2);
    }

    @Override // n4.d
    public int e(int i2) {
        return I(i2);
    }

    @Override // n4.d
    public int g(int i2) {
        int I = I(i2);
        if (I == -1 || I(I) == -1) {
            return -1;
        }
        return I;
    }

    @Override // n4.d
    public int h(int i2) {
        int N = N(i2);
        if (N == -1 || N(N) == -1) {
            return -1;
        }
        return N;
    }

    public abstract void j(t7.c cVar, Object obj);

    public abstract boolean l(b5.h hVar, b5.d dVar, b5.d dVar2);

    public abstract boolean m(b5.h hVar, Object obj, Object obj2);

    public abstract boolean n(b5.h hVar, b5.g gVar, b5.g gVar2);

    public abstract List p(String str, List list);

    public abstract String t();

    public void i(Window window) {
    }
}
