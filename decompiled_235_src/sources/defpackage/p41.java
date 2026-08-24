package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p41  reason: default package */
/* loaded from: classes.dex */
public class p41 extends ContextWrapper {
    public static Configuration Y;
    public int A;
    public Resources.Theme B;
    public LayoutInflater L;
    public Configuration R;
    public Resources X;

    public p41(Context context, int i) {
        super(context);
        this.A = i;
    }

    public final void a(Configuration configuration) {
        if (this.X == null) {
            if (this.R == null) {
                this.R = new Configuration(configuration);
                return;
            } else {
                i.m("Override configuration has already been set");
                return;
            }
        }
        i.m("getResources() or getAssets() has already been called");
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
        if (r0.equals(defpackage.p41.Y) != false) goto L13;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.X == null) {
            Configuration configuration = this.R;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (Y == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = RecyclerView.B1;
                        Y = configuration2;
                    }
                }
                this.X = createConfigurationContext(this.R).getResources();
            }
            this.X = super.getResources();
        }
        return this.X;
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
            this.A = 2132017820;
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
