package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import me.magnum.melonds.domain.model.RetroArchShaderSource;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lg6  reason: default package */
/* loaded from: classes.dex */
public final class lg6 extends hw6 implements go2 {
    public /* synthetic */ String X;
    public /* synthetic */ Uri Y;
    public final /* synthetic */ ng6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg6(ng6 ng6Var, r41 r41Var) {
        super(4, r41Var);
        this.Z = ng6Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        lg6 lg6Var = new lg6(this.Z, (r41) obj4);
        lg6Var.X = (String) obj;
        lg6Var.Y = (Uri) obj2;
        return lg6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        Object obj2;
        String str = this.X;
        Uri uri = this.Y;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
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
                if (xs6.Z(((RetroArchShaderSource) obj2).getPreferenceValue(), str, true)) {
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
            int i = cg6.a[retroArchShaderSource.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (uri != null) {
                        return new ag6(uri);
                    }
                } else {
                    i.d();
                    return null;
                }
            } else if (d != null) {
                return new zf6(d);
            }
        }
        return null;
    }
}
