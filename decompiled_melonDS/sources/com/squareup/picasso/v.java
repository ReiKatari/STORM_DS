package com.squareup.picasso;

import android.net.NetworkInfo;
import android.net.Uri;
import cd.h1;
import java.io.IOException;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f3277a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f3278b;

    public v(a0.b bVar, g0 g0Var) {
        this.f3277a = bVar;
        this.f3278b = g0Var;
    }

    @Override // com.squareup.picasso.f0
    public final boolean a(a4.n nVar) {
        String scheme = ((Uri) nVar.B).getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.f0
    public final int b() {
        return 2;
    }

    @Override // com.squareup.picasso.f0
    public final h1 c(a4.n nVar, int i2) {
        pi.g gVar;
        y yVar;
        if (i2 != 0) {
            if (s.isOfflineOnly(i2)) {
                gVar = pi.g.f11712o;
            } else {
                gVar = new pi.g(!s.shouldReadFromDiskCache(i2), !s.shouldWriteToDiskCache(i2), -1, -1, false, false, false, -1, -1, false, false, false, null);
            }
        } else {
            gVar = null;
        }
        a7.v vVar = new a7.v(7);
        vVar.x(((Uri) nVar.B).toString());
        if (gVar != null) {
            vVar.i(gVar);
        }
        x0 x0Var = new x0(vVar);
        pi.x xVar = (pi.x) this.f3277a.B;
        xVar.getClass();
        pi.d0 f8 = new ti.n(xVar, x0Var).f();
        pi.g0 g0Var = f8.Z;
        if (f8.f11710k0) {
            if (f8.f11703d0 == null) {
                yVar = y.NETWORK;
            } else {
                yVar = y.DISK;
            }
            if (yVar == y.DISK && g0Var.d() == 0) {
                g0Var.close();
                throw new IOException("Received response with 0 content-length header.");
            }
            if (yVar == y.NETWORK && g0Var.d() > 0) {
                long d4 = g0Var.d();
                j jVar = this.f3278b.f3218b;
                jVar.sendMessage(jVar.obtainMessage(4, Long.valueOf(d4)));
            }
            return new h1(g0Var.m(), yVar);
        }
        g0Var.close();
        throw new u(f8.R);
    }

    @Override // com.squareup.picasso.f0
    public final boolean d(NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
