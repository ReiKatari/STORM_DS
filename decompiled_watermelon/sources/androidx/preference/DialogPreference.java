package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence A;
    public final String B;
    public final Drawable L;
    public final String R;
    public final String X;
    public final int Y;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xx4.c, i, 0);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.A = string;
        if (string == null) {
            this.A = getTitle();
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.B = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.L = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.R = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.X = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.Y = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        is4 is4Var = getPreferenceManager().i;
        if (is4Var != null) {
            is4Var.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gk2.M(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
