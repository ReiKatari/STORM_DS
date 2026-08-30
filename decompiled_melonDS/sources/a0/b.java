package a0;

import a4.m2;
import a4.o0;
import a6.b0;
import a6.j2;
import a6.l2;
import ah.h1;
import ah.r0;
import ah.u0;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.util.LruCache;
import android.view.ContentInfo;
import android.view.View;
import android.view.Window;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.lifecycle.s0;
import c1.g1;
import c1.q2;
import com.squareup.picasso.k0;
import d0.n0;
import d0.x0;
import d0.y0;
import d1.b2;
import d1.p;
import d1.y;
import d1.z;
import d1.z1;
import j0.o1;
import j0.p1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.TreeSet;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import pi.w;
import pi.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b implements a6.d, a6.f, vg.h, w2.d, p1, x0, m0.c, b2 {
    public final /* synthetic */ int A;
    public Object B;

    public b(Context context, int i2) {
        long j2;
        int memoryClass;
        this.A = i2;
        switch (i2) {
            case 20:
                StringBuilder sb2 = k0.f3247a;
                File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j2 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
                } catch (IllegalArgumentException unused) {
                    j2 = 5242880;
                }
                long max = Math.max(Math.min(j2, 52428800L), 5242880L);
                w wVar = new w();
                wVar.f11817l = new pi.f(file, max);
                this.B = new x(wVar);
                return;
            default:
                StringBuilder sb3 = k0.f3247a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if ((context.getApplicationInfo().flags & 1048576) != 0) {
                    memoryClass = activityManager.getLargeMemoryClass();
                } else {
                    memoryClass = activityManager.getMemoryClass();
                }
                this.B = new LruCache((int) ((memoryClass * 1048576) / 7));
                return;
        }
    }

    @Override // m0.c
    public void D(Object obj) {
        switch (this.A) {
            case 22:
                Void r22 = (Void) obj;
                return;
            case 23:
                Void r23 = (Void) obj;
                return;
            default:
                Void r24 = (Void) obj;
                ((r0.f) this.B).run();
                return;
        }
    }

    @Override // vg.h
    public void E(ConsoleType consoleType) {
        consoleType.getClass();
        int i2 = EmulatorActivity.f9503a1;
        h1 C = ((EmulatorActivity) this.B).C();
        zc.x.v(s0.h(C), null, null, new u0(C, consoleType, null, 2), 3);
    }

    @Override // d1.y1
    public p F(long j2, p pVar, p pVar2, p pVar3) {
        return ((b9.e) this.B).F(j2, pVar, pVar2, pVar3);
    }

    @Override // a6.f
    public int G() {
        return a6.c.b((ContentInfo) this.B);
    }

    @Override // a6.f
    public ContentInfo H() {
        return (ContentInfo) this.B;
    }

    @Override // vg.h
    public void I() {
        ((EmulatorActivity) this.B).finish();
    }

    @Override // a6.d
    public void K(Uri uri) {
        a6.c.w((ContentInfo.Builder) this.B, uri);
    }

    @Override // d1.y1
    public p L(long j2, p pVar, p pVar2, p pVar3) {
        return ((b9.e) this.B).L(j2, pVar, pVar2, pVar3);
    }

    @Override // a6.d
    public void M(int i2) {
        a6.c.v((ContentInfo.Builder) this.B, i2);
    }

    public void N(o0 o0Var) {
        if (!o0Var.H()) {
            x3.a.c("DepthSortedSet.add called on an unattached node");
        }
        ((m2) this.B).add(o0Var);
    }

    public b6.g P(int i2) {
        return null;
    }

    public b6.g Q(int i2) {
        return null;
    }

    public y R(int i2) {
        switch (this.A) {
            case 26:
                return ((z[]) this.B)[i2];
            case 27:
                return (z) this.B;
            default:
                return (y) this.B;
        }
    }

    public void S() {
        View view = (View) this.B;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void T(View view, int i2, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.B).notifyViewVisibilityChanged(view, i2, z10);
        }
    }

    public boolean V(int i2, int i10, Bundle bundle) {
        return false;
    }

    public boolean W(o0 o0Var) {
        if (!o0Var.H()) {
            x3.a.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((m2) this.B).remove(o0Var);
    }

    public void X(boolean z10) {
        ((aj.g) this.B).e0(z10);
    }

    public void Y() {
        View view;
        View view2 = (View) this.B;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new b0(view, 0));
            }
        }
    }

    @Override // d1.b2, d1.y1
    public boolean a() {
        ((b9.e) this.B).getClass();
        return false;
    }

    @Override // d0.x0
    public ByteBuffer b() {
        return ((Image.Plane) this.B).getBuffer();
    }

    @Override // a6.d
    public a6.g build() {
        return new a6.g(new b(a6.c.h((ContentInfo.Builder) this.B)));
    }

    @Override // d1.y1
    public long c(p pVar, p pVar2, p pVar3) {
        return ((b9.e) this.B).c(pVar, pVar2, pVar3);
    }

    @Override // a6.f
    public int j() {
        return a6.c.D((ContentInfo) this.B);
    }

    @Override // vg.h
    public void o(ze.a aVar) {
        aVar.getClass();
        int i2 = EmulatorActivity.f9503a1;
        h1 C = ((EmulatorActivity) this.B).C();
        zc.x.v(s0.h(C), null, null, new r0(C, aVar, null, 1), 3);
    }

    @Override // a6.f
    public ClipData q() {
        return a6.c.c((ContentInfo) this.B);
    }

    @Override // a6.d
    public void setExtras(Bundle bundle) {
        a6.c.x((ContentInfo.Builder) this.B, bundle);
    }

    @Override // d1.y1
    public p t(p pVar, p pVar2, p pVar3) {
        return ((b9.e) this.B).t(pVar, pVar2, pVar3);
    }

    public String toString() {
        switch (this.A) {
            case 3:
                return ((m2) this.B).toString();
            case 4:
            default:
                return super.toString();
            case l1.c.f8511g /* 5 */:
                return "ContentInfoCompat{" + ((ContentInfo) this.B) + "}";
        }
    }

    @Override // d0.x0
    public int u() {
        return ((Image.Plane) this.B).getRowStride();
    }

    @Override // d0.x0
    public int v() {
        return ((Image.Plane) this.B).getPixelStride();
    }

    @Override // j0.p1
    public j0.r0 x() {
        return (j0.r0) this.B;
    }

    @Override // m0.c
    public void z(Throwable th2) {
        switch (this.A) {
            case 22:
                ((y0) this.B).close();
                return;
            case 23:
                ((n0) this.B).close();
                return;
            default:
                return;
        }
    }

    private final void U(Throwable th2) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aa.f, java.lang.Object] */
    public b(x4.c cVar) {
        this.A = 14;
        float f8 = q2.f2513a;
        ?? obj = new Object();
        obj.f685a = f8;
        float b10 = cVar.b();
        float f10 = g1.f2425a;
        obj.f686b = b10 * 386.0878f * 160.0f * 0.84f;
        this.B = obj;
    }

    public /* synthetic */ b(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    public b(int i2) {
        this.A = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B = (ExtraSupportedSurfaceCombinationsQuirk) z.a.f14847a.j(ExtraSupportedSurfaceCombinationsQuirk.class);
                return;
            case 3:
                this.B = new TreeSet(a4.l.f254a);
                return;
            case l1.c.f8510f /* 10 */:
                w2.c cVar = new w2.c();
                this.B = cVar;
                if (cVar.B) {
                    return;
                }
                if (cVar.L) {
                    x2.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                }
                cVar.a();
                cVar.L = true;
                return;
            case 11:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.B = new b6.h(this);
                    return;
                } else {
                    this.B = new b6.h(this);
                    return;
                }
            case 12:
                return;
            default:
                this.B = (SmallDisplaySizeQuirk) z.a.f14847a.j(SmallDisplaySizeQuirk.class);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r7 == r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[LOOP:1: B:21:0x0047->B:22:0x0049, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 25
            r0.A = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            d1.q[][] r4 = new d1.q[r2]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            d1.q[] r11 = new d1.q[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            d1.q r12 = new d1.q
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.B = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.<init>(int[], float[], float[][]):void");
    }

    public b(y2.d dVar) {
        this.A = 17;
        this.B = new WeakReference(dVar);
    }

    public b(o1 o1Var) {
        this.A = 2;
        this.B = (CaptureSessionOnClosedNotCalledQuirk) o1Var.j(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a6.e0, java.lang.Object, a0.b] */
    public b(View view) {
        this.A = 7;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? bVar = new b(6, view);
            bVar.L = view;
            this.B = bVar;
            return;
        }
        this.B = new b(6, view);
    }

    public b(View view, Window window) {
        this.A = 8;
        b bVar = new b(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            this.B = new l2(window, bVar);
        } else if (i2 >= 30) {
            this.B = new l2(window, bVar);
        } else if (i2 >= 26) {
            this.B = new j2(window, bVar);
        } else {
            this.B = new j2(window, bVar);
        }
    }

    public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.A = 16;
        if (Build.VERSION.SDK_INT >= 25) {
            this.B = new c6.g(uri, clipDescription, uri2);
        } else {
            this.B = new a4.n(uri, clipDescription, uri2, 6);
        }
    }

    public b(ContentInfo contentInfo) {
        this.A = 5;
        contentInfo.getClass();
        this.B = a6.c.i(contentInfo);
    }

    public b(ClipData clipData, int i2) {
        this.A = 4;
        this.B = a6.c.g(clipData, i2);
    }

    public b(float f8, float f10, p pVar) {
        b bVar;
        this.A = 29;
        int[] iArr = z1.f3715a;
        if (pVar != null) {
            bVar = new b(pVar, f8, f10);
        } else {
            bVar = new b(f8, f10);
        }
        this.B = new b9.e(5, bVar);
    }

    public void O(int i2, b6.g gVar, String str, Bundle bundle) {
    }

    public b(p pVar, float f8, float f10) {
        this.A = 26;
        int b10 = pVar.b();
        z[] zVarArr = new z[b10];
        for (int i2 = 0; i2 < b10; i2++) {
            zVarArr[i2] = new z(f8, f10, pVar.a(i2));
        }
        this.B = zVarArr;
    }

    public b(float f8, float f10) {
        this.A = 27;
        this.B = new z(f8, f10, 0.01f);
    }
}
