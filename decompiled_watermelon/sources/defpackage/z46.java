package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import me.magnum.melonds.domain.model.RetroArchShaderSource;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z46  reason: default package */
/* loaded from: classes.dex */
public final class z46 extends nk6 implements cj2 {
    public /* synthetic */ String X;
    public /* synthetic */ Uri Y;
    public final /* synthetic */ b56 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z46(b56 b56Var, j11 j11Var) {
        super(4, j11Var);
        this.Z = b56Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        z46 z46Var = new z46(this.Z, (j11) obj4);
        z46Var.X = (String) obj;
        z46Var.Y = (Uri) obj2;
        return z46Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z;
        Object obj2;
        String str = this.X;
        Uri uri = this.Y;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        File d = this.Z.f.d();
        boolean z2 = false;
        if (uri != null) {
            z = true;
        } else {
            z = false;
        }
        if (d != null) {
            z2 = true;
        }
        RetroArchShaderSource.Companion.getClass();
        Iterator<E> it = RetroArchShaderSource.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (gh6.g0(((RetroArchShaderSource) obj2).getPreferenceValue(), str, true)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        RetroArchShaderSource retroArchShaderSource = (RetroArchShaderSource) obj2;
        if (retroArchShaderSource == null) {
            if (z) {
                retroArchShaderSource = RetroArchShaderSource.FOLDER;
            } else if (z2) {
                retroArchShaderSource = RetroArchShaderSource.INTERNAL;
            } else {
                retroArchShaderSource = null;
            }
        }
        if (retroArchShaderSource != null) {
            int i = q46.a[retroArchShaderSource.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (uri != null) {
                        return new o46(uri);
                    }
                } else {
                    i.c();
                    return null;
                }
            } else if (d != null) {
                return new n46(d);
            }
        }
        return null;
    }
}
