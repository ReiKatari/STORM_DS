package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h11  reason: default package */
/* loaded from: classes.dex */
public class h11 extends ContextWrapper {
    public static Configuration Y;
    public int A;
    public Resources.Theme B;
    public LayoutInflater L;
    public Configuration R;
    public Resources X;

    public h11(Context context, int i) {
        super(context);
        this.A = i;
    }

    public final void a(Configuration configuration) {
        if (this.X == null) {
            if (this.R == null) {
                this.R = new Configuration(configuration);
                return;
            } else {
                i.n("Override configuration has already been set");
                return;
            }
        }
        i.n("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.B == null) {
            this.B = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.B.setTo(theme);
            }
        }
        this.B.applyStyle(this.A, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0.equals(defpackage.h11.Y) != false) goto L13;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.X
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.R
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = defpackage.h11.Y
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.h11.Y = r1
        L1c:
            android.content.res.Configuration r1 = defpackage.h11.Y
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.R
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.X = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.X = r0
        L38:
            android.content.res.Resources r3 = r3.X
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h11.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.L == null) {
                this.L = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.L;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.B;
        if (theme != null) {
            return theme;
        }
        if (this.A == 0) {
            this.A = 2132017812;
        }
        b();
        return this.B;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.A != i) {
            this.A = i;
            b();
        }
    }
}
