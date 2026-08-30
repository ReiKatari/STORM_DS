package d0;

import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements j0.d1 {
    public final /* synthetic */ int A;
    public boolean B;
    public Object L;
    public final Object R;

    public c(x.j jVar) {
        this.A = 4;
        this.L = jVar;
        this.R = rd.k.n(jVar);
        int[] iArr = (int[]) jVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (iArr[i2] == 18) {
                    z10 = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.B = z10;
    }

    public static boolean d(a0 a0Var, a0 a0Var2) {
        boolean b10 = a0Var2.b();
        int i2 = a0Var2.f3326a;
        p7.m.o("Fully specified range is not actually fully specified.", b10);
        int i10 = a0Var.f3326a;
        if (i10 != 2 || i2 != 1) {
            if (i10 == 2 || i10 == 0 || i10 == i2) {
                int i11 = a0Var.f3327b;
                if (i11 == 0 || i11 == a0Var2.f3327b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean g(a0 a0Var, a0 a0Var2, HashSet hashSet) {
        if (!hashSet.contains(a0Var2)) {
            aj.g.o("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + a0Var + "\nCandidate dynamic range:\n  " + a0Var2);
            return false;
        }
        return d(a0Var, a0Var2);
    }

    public static a0 i(a0 a0Var, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (a0Var.f3326a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                a0 a0Var2 = (a0) it.next();
                p7.m.l(a0Var2, "Fully specified DynamicRange cannot be null.");
                int i2 = a0Var2.f3326a;
                p7.m.o("Fully specified DynamicRange must have fully defined encoding.", a0Var2.b());
                if (i2 != 1 && g(a0Var, a0Var2, hashSet)) {
                    return a0Var2;
                }
            }
            return null;
        }
        return null;
    }

    public static void l(HashSet hashSet, a0 a0Var, rd.k kVar) {
        p7.m.o("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set b10 = ((y.b) kVar.B).b(a0Var);
        if (!b10.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(b10);
            if (hashSet.isEmpty()) {
                String join = TextUtils.join("\n  ", b10);
                String join2 = TextUtils.join("\n  ", hashSet2);
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + a0Var + "\nConstraints:\n  " + join + "\nExisting constraints:\n  " + join2);
            }
        }
    }

    @Override // j0.d1
    public int a() {
        int height;
        synchronized (this.R) {
            height = ((ImageReader) this.L).getHeight();
        }
        return height;
    }

    @Override // j0.d1
    public void b(final j0.c1 c1Var, final Executor executor) {
        synchronized (this.R) {
            this.B = false;
            ((ImageReader) this.L).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: d0.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    c cVar = c.this;
                    Executor executor2 = executor;
                    j0.c1 c1Var2 = c1Var;
                    synchronized (cVar.R) {
                        try {
                            if (!cVar.B) {
                                executor2.execute(new ad.c(2, cVar, c1Var2));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }, k0.d.B());
        }
    }

    @Override // j0.d1
    public int c() {
        int width;
        synchronized (this.R) {
            width = ((ImageReader) this.L).getWidth();
        }
        return width;
    }

    @Override // j0.d1
    public void close() {
        synchronized (this.R) {
            ((ImageReader) this.L).close();
        }
    }

    @Override // j0.d1
    public y0 e() {
        Image image;
        synchronized (this.R) {
            try {
                image = ((ImageReader) this.L).acquireLatestImage();
            } catch (RuntimeException e6) {
                if ("ImageReaderContext is not initialized".equals(e6.getMessage())) {
                    image = null;
                } else {
                    throw e6;
                }
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    @Override // j0.d1
    public int f() {
        int imageFormat;
        synchronized (this.R) {
            imageFormat = ((ImageReader) this.L).getImageFormat();
        }
        return imageFormat;
    }

    @Override // j0.d1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.R) {
            surface = ((ImageReader) this.L).getSurface();
        }
        return surface;
    }

    @Override // j0.d1
    public void h() {
        synchronized (this.R) {
            this.B = true;
            ((ImageReader) this.L).setOnImageAvailableListener(null, null);
        }
    }

    public f2.j j() {
        f2.s sVar = (f2.s) this.R;
        int i2 = sVar.f4789b;
        int i10 = sVar.f4790c;
        if (i2 < i10) {
            return f2.j.NOT_CROSSED;
        }
        if (i2 > i10) {
            return f2.j.CROSSED;
        }
        return f2.j.COLLAPSED;
    }

    public void k() {
        if (this.B) {
            f2.b1.b((f2.b1) this.R, (l4.q0) this.L);
        }
    }

    public long m(q4.x xVar, long j2, boolean z10, a0.j jVar) {
        u1.d0 d0Var;
        f2.b1 b1Var = (f2.b1) this.R;
        long c4 = f2.b1.c(b1Var, xVar, j2, z10, false, jVar, false);
        if (!l4.q0.a(c4, (l4.q0) this.L)) {
            this.B = false;
        }
        if (l4.q0.c(c4)) {
            d0Var = u1.d0.Cursor;
        } else {
            d0Var = u1.d0.Selection;
        }
        b1Var.q(d0Var);
        return c4;
    }

    @Override // j0.d1
    public int n() {
        int maxImages;
        synchronized (this.R) {
            maxImages = ((ImageReader) this.L).getMaxImages();
        }
        return maxImages;
    }

    @Override // j0.d1
    public y0 p() {
        Image image;
        synchronized (this.R) {
            try {
                image = ((ImageReader) this.L).acquireNextImage();
            } catch (RuntimeException e6) {
                if ("ImageReaderContext is not initialized".equals(e6.getMessage())) {
                    image = null;
                } else {
                    throw e6;
                }
            }
            if (image == null) {
                return null;
            }
            return new a(image);
        }
    }

    public String toString() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return "SingleSelectionLayout(isStartHandle=" + this.B + ", crossed=" + j() + ", info=\n\t" + ((f2.s) this.R) + ')';
            default:
                return super.toString();
        }
    }

    public c(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this.A = 3;
        j0.o1 o1Var = o0.a.f10495a;
        if (o0.a.f10495a.j(LowMemoryQuirk.class) != null) {
            this.L = new l0.h(executor);
        } else {
            this.L = executor;
        }
        this.R = o1Var;
        this.B = o1Var.h(IncorrectJpegMetadataQuirk.class);
    }

    public c(ImageReader imageReader) {
        this.A = 0;
        this.R = new Object();
        this.B = true;
        this.L = imageReader;
    }

    public c(boolean z10, f2.v vVar, f2.s sVar) {
        this.A = 1;
        this.B = z10;
        this.L = vVar;
        this.R = sVar;
    }

    public c(f2.b1 b1Var) {
        this.A = 2;
        this.R = b1Var;
        this.B = true;
    }
}
