package defpackage;

import android.content.ClipData;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bq0  reason: default package */
/* loaded from: classes.dex */
public class bq0 implements lx3, sw3, nw2, as, h94, l45, yw3, l01, n01, bc4 {
    public static final fl2 L = new fl2(1);
    public static final bq0 R = new bq0(2, false);
    public static final vn1 X = new vn1(28);
    public final /* synthetic */ int A;
    public Object B;

    /* JADX WARN: Type inference failed for: r5v15, types: [it3, java.lang.Object] */
    public bq0(int i) {
        qx3 qx3Var;
        this.A = i;
        switch (i) {
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.B = new u2(this);
                    return;
                } else {
                    this.B = new u2(this);
                    return;
                }
            case 11:
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    this.B = keyStore;
                    return;
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case ig7.e /* 15 */:
                this.B = new AtomicReference(null);
                return;
            case 21:
                ox4 ox4Var = oe1.a;
                this.B = (CloseCameraDeviceOnCameraGraphCloseQuirk) oe1.a().b(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                return;
            case 25:
                TimeUnit.MINUTES.getClass();
                fn6 fn6Var = fn6.l;
                fn6Var.getClass();
                this.B = new bo1(fn6Var);
                return;
            case 29:
                this.B = new b34();
                return;
            default:
                try {
                    qx3Var = (qx3) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    qx3Var = L;
                }
                qx3[] qx3VarArr = {fl2.b, qx3Var};
                ?? obj = new Object();
                obj.a = qx3VarArr;
                Charset charset = s33.a;
                this.B = obj;
                return;
        }
    }

    public static void W(String str) {
        if (!new bq0(11).Z(str)) {
            String b = n67.b(str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return;
        }
        i.i(wh1.A("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
    }

    @Override // defpackage.n01
    public int A() {
        int flags;
        flags = ((ContentInfo) this.B).getFlags();
        return flags;
    }

    @Override // defpackage.n01
    public ContentInfo B() {
        return (ContentInfo) this.B;
    }

    @Override // defpackage.sw3
    public void D(uw3 uw3Var) {
        sw3 sw3Var = ((ActionMenuView) this.B).t0;
        if (sw3Var != null) {
            sw3Var.D(uw3Var);
        }
    }

    @Override // defpackage.l01
    public void F(Uri uri) {
        ((ContentInfo.Builder) this.B).setLinkUri(uri);
    }

    @Override // defpackage.bc4
    public vf7 G(View view, vf7 vf7Var) {
        boolean z;
        rf7 rf7Var = vf7Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.B;
        if (!Objects.equals(coordinatorLayout.l0, vf7Var)) {
            coordinatorLayout.l0 = vf7Var;
            boolean z2 = true;
            if (vf7Var.d() > 0) {
                z = true;
            } else {
                z = false;
            }
            coordinatorLayout.m0 = z;
            coordinatorLayout.setWillNotDraw((z || coordinatorLayout.getBackground() != null) ? false : false);
            if (!rf7Var.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = aa7.a;
                    if (childAt.getFitsSystemWindows() && ((z11) childAt.getLayoutParams()).a != null && rf7Var.r()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return vf7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zc0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [pp1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // defpackage.h94
    public void L(Object obj) {
        xe0 xe0Var;
        ?? r1;
        bf0 bf0Var;
        i40 i40Var;
        ?? r4;
        int i;
        Iterable<String> n1;
        List<pd0> list = (List) obj;
        if (((xe0) this.B).l.get() && (r1 = (xe0Var = (xe0) this.B).f) != 0 && (bf0Var = xe0Var.g) != null && (i40Var = xe0Var.i) != null) {
            if (list != null) {
                r4 = new ArrayList(uq0.y0(list, 10));
                for (pd0 pd0Var : list) {
                    r4.add(pd0Var.a());
                }
            } else {
                r4 = pp1.A;
            }
            try {
                List list2 = ((xe0) this.B).k;
                if (((AtomicBoolean) r1.k).get()) {
                    n1 = pp1.A;
                } else {
                    n1 = tq0.n1(r1.b(r4));
                }
                ArrayList arrayList = new ArrayList(uq0.y0(n1, 10));
                for (String str : n1) {
                    str.getClass();
                    arrayList.add(dk7.p(str, null, null));
                }
                Set I = hi2.I(tq0.s1(list2), tq0.s1(arrayList));
                if (!I.isEmpty() && i40Var.c(bf0Var.c(), I)) {
                    ve2.c0("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                    return;
                }
            } catch (Exception e) {
                ve2.d0("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
            }
            try {
                r1.h(r4);
                Set<String> e2 = r1.e();
                ArrayList arrayList2 = new ArrayList(uq0.y0(e2, 10));
                for (String str2 : e2) {
                    str2.getClass();
                    arrayList2.add(dk7.p(str2, null, null));
                }
                if (!arrayList2.equals(((xe0) this.B).k)) {
                    xe0 xe0Var2 = (xe0) this.B;
                    List<pd0> n12 = tq0.n1(xe0Var2.k);
                    if (!arrayList2.equals(n12)) {
                        synchronized (xe0Var2.d) {
                            i = 0;
                            if (xe0Var2.e != null) {
                                ve2.v("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                                ScheduledFuture scheduledFuture = xe0Var2.e;
                                scheduledFuture.getClass();
                                scheduledFuture.cancel(false);
                                xe0Var2.e = null;
                            }
                        }
                        Set s1 = tq0.s1(n12);
                        Set s12 = tq0.s1(arrayList2);
                        Set<pd0> I2 = hi2.I(s12, s1);
                        Set<pd0> I3 = hi2.I(s1, s12);
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList(uq0.y0(arrayList2, 10));
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            arrayList4.add(((pd0) obj2).a());
                        }
                        try {
                            for (pd0 pd0Var2 : I3) {
                                xe0Var2.c(pd0Var2.a());
                            }
                            bf0 bf0Var2 = xe0Var2.g;
                            if (bf0Var2 != null) {
                                ve2.v("CameraPresencePrvdr", "Updating CameraRepository...");
                                bf0Var2.a(arrayList4);
                                arrayList3.add(bf0Var2);
                                ve2.v("CameraPresencePrvdr", "CameraRepository updated successfully.");
                            }
                            if (!xe0Var2.m.isEmpty()) {
                                ve2.v("CameraPresencePrvdr", "Updating " + xe0Var2.m.size() + " dependent listeners...");
                                Iterator it = xe0Var2.m.iterator();
                                while (it.hasNext()) {
                                    a43 a43Var = (a43) it.next();
                                    a43Var.a(arrayList4);
                                    arrayList3.add(a43Var);
                                }
                            }
                            xe0Var2.k = arrayList2;
                            for (pd0 pd0Var3 : I2) {
                                xe0Var2.a(pd0Var3.a());
                            }
                            xe0Var2.b(I2, I3);
                        } catch (Exception e3) {
                            ve2.x("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e3);
                            ArrayList arrayList5 = new ArrayList(uq0.y0(n12, 10));
                            for (pd0 pd0Var4 : n12) {
                                arrayList5.add(pd0Var4.a());
                            }
                            Iterator it2 = new uf5(arrayList3).iterator();
                            while (true) {
                                tf5 tf5Var = (tf5) it2;
                                if (!((ListIterator) tf5Var.B).hasPrevious()) {
                                    break;
                                }
                                a43 a43Var2 = (a43) ((ListIterator) tf5Var.B).previous();
                                try {
                                    a43Var2.a(arrayList5);
                                } catch (Exception e4) {
                                    ve2.x("CameraPresencePrvdr", "Failed to rollback listener: " + a43Var2, e4);
                                }
                            }
                            for (pd0 pd0Var5 : I3) {
                                xe0Var2.a(pd0Var5.a());
                            }
                            for (pd0 pd0Var6 : I2) {
                                xe0Var2.c(pd0Var6.a());
                            }
                        }
                    }
                }
            } catch (Exception e5) {
                ve2.d0("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e5);
            }
        }
    }

    @Override // defpackage.lx3
    public boolean M(uw3 uw3Var) {
        f8 f8Var = (f8) this.B;
        if (uw3Var != f8Var.L) {
            ((rh6) uw3Var).A.getClass();
            lx3 lx3Var = f8Var.X;
            if (lx3Var != null) {
                return lx3Var.M(uw3Var);
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.l01
    public void N(int i) {
        ((ContentInfo.Builder) this.B).setFlags(i);
    }

    public void P(float f, float f2, float f3, float f4, int i) {
        ((os) this.B).s().f(f, f2, f3, f4, i);
    }

    public t2 Q(int i) {
        return null;
    }

    public void R() {
        ((dv0) this.B).getClass();
    }

    public byte[] S(byte[] bArr, byte[] bArr2) {
        try {
            return T(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("bq0", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return this.T(bArr, bArr2);
        }
    }

    public byte[] T(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, (SecretKey) this.B, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        f81.u("ciphertext too short");
        return null;
    }

    public byte[] U(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, (SecretKey) this.B);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        f81.u("plaintext too long");
        return null;
    }

    public t2 V(int i) {
        return null;
    }

    public ra7 X(qo0 qo0Var) {
        q9 q9Var = (q9) this.B;
        String b = qo0Var.b();
        if (b != null) {
            return q9Var.F(qo0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        i.i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public synchronized bq0 Y(String str) {
        bq0 bq0Var;
        byte[] U;
        bq0Var = new bq0(n67.b(str), (KeyStore) this.B);
        byte[] a = d45.a(10);
        byte[] bArr = new byte[0];
        try {
            U = bq0Var.U(a, bArr);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("bq0", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            U = bq0Var.U(a, bArr);
        }
        if (!Arrays.equals(a, bq0Var.S(U, bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bq0Var;
    }

    public synchronized boolean Z(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w("bq0", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.B = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return ((KeyStore) this.B).containsAlias(str2);
        }
        return ((KeyStore) this.B).containsAlias(n67.b(str));
    }

    public void a0(float f, float f2, float f3, float f4) {
        os osVar = (os) this.B;
        oh0 s = osVar.s();
        float intBitsToFloat = Float.intBitsToFloat((int) (osVar.E() >> 32)) - (f3 + f);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (osVar.E() & 4294967295L)) - (f4 + f2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < RecyclerView.A1 || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < RecyclerView.A1) {
            lz2.a("Width and height must be greater than or equal to zero");
        }
        osVar.Q(floatToRawIntBits);
        s.g(f, f2);
    }

    @Override // defpackage.nw2
    public ByteBuffer b() {
        return ((Image.Plane) this.B).getBuffer();
    }

    public boolean b0(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.l01
    public o01 build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.B).build();
        return new o01(new bq0(build));
    }

    public void c0(float f, long j) {
        oh0 s = ((os) this.B).s();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        s.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        s.c(f);
        s.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void d0(float f, float f2, long j) {
        oh0 s = ((os) this.B).s();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        s.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        s.b(f, f2);
        s.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void e0(float f, float f2) {
        ((os) this.B).s().g(f, f2);
    }

    @Override // defpackage.lx3
    public void f(uw3 uw3Var, boolean z) {
        if (uw3Var instanceof rh6) {
            ((rh6) uw3Var).z.k().c(false);
        }
        lx3 lx3Var = ((f8) this.B).X;
        if (lx3Var != null) {
            lx3Var.f(uw3Var, z);
        }
    }

    public void f0(int i, boolean z) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.r(i, 0);
        zp0Var.k(z ? (byte) 1 : (byte) 0);
    }

    public void g0(int i, x70 x70Var) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.r(i, 2);
        zp0Var.s(x70Var.size());
        v70 v70Var = (v70) x70Var;
        zp0Var.l(v70Var.R, v70Var.k(), v70Var.size());
    }

    public void h0(double d, int i) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.getClass();
        zp0Var.o(i, Double.doubleToRawLongBits(d));
    }

    public void i0(int i, int i2) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.r(i, 0);
        zp0Var.q(i2);
    }

    @Override // defpackage.n01
    public int j() {
        int source;
        source = ((ContentInfo) this.B).getSource();
        return source;
    }

    public void j0(int i, int i2) {
        ((zp0) this.B).m(i, i2);
    }

    public void k0(int i, long j) {
        ((zp0) this.B).o(i, j);
    }

    public void l0(int i, float f) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.getClass();
        zp0Var.m(i, Float.floatToRawIntBits(f));
    }

    @Override // defpackage.n01
    public ClipData m() {
        ClipData clip;
        clip = ((ContentInfo) this.B).getClip();
        return clip;
    }

    public void m0(int i, Object obj, cv5 cv5Var) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.r(i, 3);
        cv5Var.a((b1) obj, zp0Var.a);
        zp0Var.r(i, 4);
    }

    public void n0(int i, int i2) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.r(i, 0);
        zp0Var.q(i2);
    }

    public void o0(int i, long j) {
        ((zp0) this.B).t(i, j);
    }

    @Override // defpackage.h94
    public void onError(Throwable th) {
        th.getClass();
        xe0 xe0Var = (xe0) this.B;
        if (xe0Var.l.get()) {
            ve2.x("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
            wn4 wn4Var = xe0Var.h;
            if (wn4Var != null) {
                wn4Var.a();
            }
        }
    }

    public void p0(int i, Object obj, cv5 cv5Var) {
        zp0 zp0Var = (zp0) this.B;
        b1 b1Var = (b1) obj;
        zp0Var.r(i, 2);
        b1Var.getClass();
        jl2 jl2Var = (jl2) b1Var;
        int i2 = jl2Var.memoizedSerializedSize;
        if (i2 == -1) {
            i2 = cv5Var.g(b1Var);
            jl2Var.memoizedSerializedSize = i2;
        }
        zp0Var.s(i2);
        cv5Var.a(b1Var, zp0Var.a);
    }

    public void q0(int i, int i2) {
        ((zp0) this.B).m(i, i2);
    }

    @Override // defpackage.nw2
    public int r() {
        return ((Image.Plane) this.B).getRowStride();
    }

    public void r0(int i, long j) {
        ((zp0) this.B).o(i, j);
    }

    public void s0(int i, int i2) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.r(i, 0);
        zp0Var.s((i2 >> 31) ^ (i2 << 1));
    }

    @Override // defpackage.l01
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.B).setExtras(bundle);
    }

    @Override // defpackage.sw3
    public boolean t(uw3 uw3Var, MenuItem menuItem) {
        boolean z;
        i8 i8Var = ((ActionMenuView) this.B).y0;
        if (i8Var != null) {
            Toolbar toolbar = ((nv6) i8Var).A;
            Iterator it = ((CopyOnWriteArrayList) toolbar.E0.R).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((gg2) it.next()).a.p(menuItem)) {
                        z = true;
                        break;
                    }
                } else {
                    rv6 rv6Var = toolbar.G0;
                    if (rv6Var != null) {
                        z = ((tv6) rv6Var).A.p0.onMenuItemSelected(0, menuItem);
                    } else {
                        z = false;
                    }
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void t0(int i, long j) {
        ((zp0) this.B).t(i, (j >> 63) ^ (j << 1));
    }

    public String toString() {
        switch (this.A) {
            case 27:
                return "ContentInfoCompat{" + ((ContentInfo) this.B) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nw2
    public int u() {
        return ((Image.Plane) this.B).getPixelStride();
    }

    public void u0(int i, int i2) {
        zp0 zp0Var = (zp0) this.B;
        zp0Var.r(i, 0);
        zp0Var.s(i2);
    }

    @Override // defpackage.yw3
    public void v(uw3 uw3Var, MenuItem menuItem) {
        ((yi0) this.B).Y.removeCallbacksAndMessages(uw3Var);
    }

    public void v0(int i, long j) {
        ((zp0) this.B).t(i, j);
    }

    @Override // defpackage.l45
    public cw0 w() {
        return (cw0) this.B;
    }

    @Override // defpackage.yw3
    public void y(uw3 uw3Var, zw3 zw3Var) {
        yi0 yi0Var = (yi0) this.B;
        Handler handler = yi0Var.Y;
        xi0 xi0Var = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = yi0Var.c0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (uw3Var == ((xi0) arrayList.get(i)).b) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            xi0Var = (xi0) arrayList.get(i2);
        }
        handler.postAtTime(new wi0(this, xi0Var, zw3Var, uw3Var), uw3Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.as
    public void E(int i) {
    }

    @Override // defpackage.as
    public void s(int i) {
    }

    @Override // defpackage.as
    public void K(int i, float f) {
    }

    public /* synthetic */ bq0(int i, boolean z) {
        this.A = i;
    }

    public bq0(cw0 cw0Var) {
        this.A = 19;
        cw0Var.getClass();
        this.B = cw0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r7 == r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[LOOP:1: B:21:0x0047->B:22:0x0049, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bq0(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 14
            r0.A = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            ht[][] r4 = new defpackage.ht[r2]
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
            ht[] r11 = new defpackage.ht[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            ht r12 = new ht
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq0.<init>(int[], float[], float[][]):void");
    }

    public bq0(za7 za7Var, xa7 xa7Var, z31 z31Var) {
        this.A = 3;
        za7Var.getClass();
        xa7Var.getClass();
        z31Var.getClass();
        this.B = new q9(za7Var, xa7Var, z31Var);
    }

    public bq0(zp0 zp0Var) {
        this.A = 0;
        s33.a(zp0Var, "output");
        this.B = zp0Var;
        zp0Var.a = this;
    }

    public bq0(String str, KeyStore keyStore) {
        this.A = 10;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.B = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }

    public /* synthetic */ bq0(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    public bq0(ContentInfo contentInfo) {
        this.A = 27;
        contentInfo.getClass();
        this.B = ph0.k(contentInfo);
    }

    public bq0(ClipData clipData, int i) {
        this.A = 26;
        this.B = ph0.i(clipData, i);
    }

    public void O(int i, t2 t2Var, String str, Bundle bundle) {
    }
}
