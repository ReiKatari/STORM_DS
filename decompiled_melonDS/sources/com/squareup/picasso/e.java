package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import b4.w0;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f3198m0 = new Object();

    /* renamed from: n0  reason: collision with root package name */
    public static final w0 f3199n0 = new w0(1);

    /* renamed from: o0  reason: collision with root package name */
    public static final AtomicInteger f3200o0 = new AtomicInteger();
    public static final c p0 = new Object();
    public final int A = f3200o0.incrementAndGet();
    public final a0 B;
    public final m L;
    public final a0.b R;
    public final g0 X;
    public final String Y;
    public final a4.n Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f3201b0;

    /* renamed from: c0  reason: collision with root package name */
    public final f0 f3202c0;

    /* renamed from: d0  reason: collision with root package name */
    public n f3203d0;

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList f3204e0;

    /* renamed from: f0  reason: collision with root package name */
    public Bitmap f3205f0;

    /* renamed from: g0  reason: collision with root package name */
    public Future f3206g0;

    /* renamed from: h0  reason: collision with root package name */
    public y f3207h0;

    /* renamed from: i0  reason: collision with root package name */
    public Exception f3208i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f3209j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3210k0;

    /* renamed from: l0  reason: collision with root package name */
    public z f3211l0;

    public e(a0 a0Var, m mVar, a0.b bVar, g0 g0Var, n nVar, f0 f0Var) {
        this.B = a0Var;
        this.L = mVar;
        this.R = bVar;
        this.X = g0Var;
        this.f3203d0 = nVar;
        this.Y = nVar.f3268d;
        a4.n nVar2 = nVar.f3266b;
        this.Z = nVar2;
        this.f3211l0 = (z) nVar2.R;
        this.f3201b0 = 0;
        this.f3202c0 = f0Var;
        this.f3210k0 = f0Var.b();
    }

    public static Bitmap b(fj.g0 g0Var, a4.n nVar) {
        boolean z10;
        fj.a0 x9 = ij.a.x(g0Var);
        if (x9.m(0L, k0.f3248b) && x9.m(8L, k0.f3249c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        nVar.getClass();
        if (!z10) {
            Bitmap decodeStream = BitmapFactory.decodeStream(new fj.d(x9, 1), null, null);
            if (decodeStream != null) {
                return decodeStream;
            }
            fj.j.h("Failed to decode stream.");
            return null;
        }
        fj.e eVar = x9.B;
        eVar.d0(x9.A);
        byte[] I = eVar.I(eVar.B);
        return BitmapFactory.decodeByteArray(I, 0, I.length, null);
    }

    public static void e(a4.n nVar) {
        String hexString;
        Uri uri = (Uri) nVar.B;
        if (uri != null) {
            hexString = String.valueOf(uri.getPath());
        } else {
            hexString = Integer.toHexString(0);
        }
        StringBuilder sb2 = (StringBuilder) f3199n0.get();
        sb2.ensureCapacity(hexString.length() + 8);
        sb2.replace(8, sb2.length(), hexString);
        Thread.currentThread().setName(sb2.toString());
    }

    public final boolean a() {
        ArrayList arrayList;
        Future future;
        if (this.f3203d0 != null || (((arrayList = this.f3204e0) != null && !arrayList.isEmpty()) || (future = this.f3206g0) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    public final void c(n nVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f3203d0 == nVar) {
            this.f3203d0 = null;
            z10 = true;
        } else {
            ArrayList arrayList = this.f3204e0;
            if (arrayList != null) {
                z10 = arrayList.remove(nVar);
            } else {
                z10 = false;
            }
        }
        if (z10 && ((z) nVar.f3266b.R) == this.f3211l0) {
            z zVar = z.LOW;
            ArrayList arrayList2 = this.f3204e0;
            z11 = (arrayList2 == null || arrayList2.isEmpty()) ? false : false;
            n nVar2 = this.f3203d0;
            if (nVar2 != null || z11) {
                if (nVar2 != null) {
                    zVar = (z) nVar2.f3266b.R;
                }
                if (z11) {
                    int size = this.f3204e0.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        z zVar2 = (z) ((n) this.f3204e0.get(i2)).f3266b.R;
                        if (zVar2.ordinal() > zVar.ordinal()) {
                            zVar = zVar2;
                        }
                    }
                }
            }
            this.f3211l0 = zVar;
        }
        this.B.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.e.d():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.L;
        try {
            try {
                try {
                    try {
                        e(this.Z);
                        this.B.getClass();
                        Bitmap d4 = d();
                        this.f3205f0 = d4;
                        if (d4 == null) {
                            j jVar = (j) mVar.f3261j;
                            jVar.sendMessage(jVar.obtainMessage(6, this));
                        } else {
                            mVar.b(this);
                        }
                    } catch (OutOfMemoryError e6) {
                        StringWriter stringWriter = new StringWriter();
                        this.X.a().a(new PrintWriter(stringWriter));
                        this.f3208i0 = new RuntimeException(stringWriter.toString(), e6);
                        j jVar2 = (j) mVar.f3261j;
                        jVar2.sendMessage(jVar2.obtainMessage(6, this));
                    }
                } catch (Exception e10) {
                    this.f3208i0 = e10;
                    j jVar3 = (j) mVar.f3261j;
                    jVar3.sendMessage(jVar3.obtainMessage(6, this));
                }
            } catch (u e11) {
                if (!s.isOfflineOnly(0) || e11.A != 504) {
                    this.f3208i0 = e11;
                }
                j jVar4 = (j) mVar.f3261j;
                jVar4.sendMessage(jVar4.obtainMessage(6, this));
            } catch (IOException e12) {
                this.f3208i0 = e12;
                j jVar5 = (j) mVar.f3261j;
                jVar5.sendMessageDelayed(jVar5.obtainMessage(5, this), 500L);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
