package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x20  reason: default package */
/* loaded from: classes.dex */
public final class x20 implements Runnable {
    public static final Object n0 = new Object();
    public static final em o0 = new em(1);
    public static final AtomicInteger p0 = new AtomicInteger();
    public static final v20 q0 = new Object();
    public final int A = p0.incrementAndGet();
    public final nn4 B;
    public final qg1 L;
    public final ka3 R;
    public final af6 X;
    public final String Y;
    public final n85 Z;
    public int c0;
    public final fb5 d0;
    public ex2 e0;
    public ArrayList f0;
    public Bitmap g0;
    public Future h0;
    public ln4 i0;
    public Exception j0;
    public int k0;
    public int l0;
    public mn4 m0;

    public x20(nn4 nn4Var, qg1 qg1Var, ka3 ka3Var, af6 af6Var, ex2 ex2Var, fb5 fb5Var) {
        this.B = nn4Var;
        this.L = qg1Var;
        this.R = ka3Var;
        this.X = af6Var;
        this.e0 = ex2Var;
        this.Y = ex2Var.d;
        n85 n85Var = ex2Var.b;
        this.Z = n85Var;
        this.m0 = (mn4) n85Var.R;
        this.c0 = 0;
        this.d0 = fb5Var;
        this.l0 = fb5Var.b();
    }

    public static Bitmap b(sb6 sb6Var, n85 n85Var) {
        boolean z;
        s45 o = sn2.o(sb6Var);
        if (o.p(0L, e67.b) && o.p(8L, e67.c)) {
            z = true;
        } else {
            z = false;
        }
        n85Var.getClass();
        if (!z) {
            Bitmap decodeStream = BitmapFactory.decodeStream(new e60(o, 1), null, null);
            if (decodeStream != null) {
                return decodeStream;
            }
            f81.j("Failed to decode stream.");
            return null;
        }
        f60 f60Var = o.B;
        f60Var.l0(o.A);
        byte[] K = f60Var.K(f60Var.B);
        return BitmapFactory.decodeByteArray(K, 0, K.length, null);
    }

    public static void e(n85 n85Var) {
        String hexString;
        Uri uri = (Uri) n85Var.B;
        if (uri != null) {
            hexString = String.valueOf(uri.getPath());
        } else {
            hexString = Integer.toHexString(0);
        }
        StringBuilder sb = (StringBuilder) o0.get();
        sb.ensureCapacity(hexString.length() + 8);
        sb.replace(8, sb.length(), hexString);
        Thread.currentThread().setName(sb.toString());
    }

    public final boolean a() {
        ArrayList arrayList;
        Future future;
        if (this.e0 != null || (((arrayList = this.f0) != null && !arrayList.isEmpty()) || (future = this.h0) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    public final void c(ex2 ex2Var) {
        boolean z;
        boolean z2 = true;
        if (this.e0 == ex2Var) {
            this.e0 = null;
            z = true;
        } else {
            ArrayList arrayList = this.f0;
            if (arrayList != null) {
                z = arrayList.remove(ex2Var);
            } else {
                z = false;
            }
        }
        if (z && ((mn4) ex2Var.b.R) == this.m0) {
            mn4 mn4Var = mn4.LOW;
            ArrayList arrayList2 = this.f0;
            z2 = (arrayList2 == null || arrayList2.isEmpty()) ? false : false;
            ex2 ex2Var2 = this.e0;
            if (ex2Var2 != null || z2) {
                if (ex2Var2 != null) {
                    mn4Var = (mn4) ex2Var2.b.R;
                }
                if (z2) {
                    int size = this.f0.size();
                    for (int i = 0; i < size; i++) {
                        mn4 mn4Var2 = (mn4) ((ex2) this.f0.get(i)).b.R;
                        if (mn4Var2.ordinal() > mn4Var.ordinal()) {
                            mn4Var = mn4Var2;
                        }
                    }
                }
            }
            this.m0 = mn4Var;
        }
        this.B.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x20.d():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public final void run() {
        qg1 qg1Var = this.L;
        try {
            try {
                try {
                    try {
                        e(this.Z);
                        this.B.getClass();
                        Bitmap d = d();
                        this.g0 = d;
                        if (d == null) {
                            og1 og1Var = (og1) qg1Var.j;
                            og1Var.sendMessage(og1Var.obtainMessage(6, this));
                        } else {
                            qg1Var.b(this);
                        }
                    } catch (OutOfMemoryError e) {
                        StringWriter stringWriter = new StringWriter();
                        this.X.a().a(new PrintWriter(stringWriter));
                        this.j0 = new RuntimeException(stringWriter.toString(), e);
                        og1 og1Var2 = (og1) qg1Var.j;
                        og1Var2.sendMessage(og1Var2.obtainMessage(6, this));
                    }
                } catch (Exception e2) {
                    this.j0 = e2;
                    og1 og1Var3 = (og1) qg1Var.j;
                    og1Var3.sendMessage(og1Var3.obtainMessage(6, this));
                }
            } catch (p64 e3) {
                if (!l64.isOfflineOnly(0) || e3.A != 504) {
                    this.j0 = e3;
                }
                og1 og1Var4 = (og1) qg1Var.j;
                og1Var4.sendMessage(og1Var4.obtainMessage(6, this));
            } catch (IOException e4) {
                this.j0 = e4;
                og1 og1Var5 = (og1) qg1Var.j;
                og1Var5.sendMessageDelayed(og1Var5.obtainMessage(5, this), 500L);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
