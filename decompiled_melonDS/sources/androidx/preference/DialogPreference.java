package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence A;
    public final String B;
    public final Drawable L;
    public final String R;
    public final String X;
    public final int Y;

    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.f1573c, i2, 0);
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
        a0 a0Var = getPreferenceManager().f1559i;
        if (a0Var != null) {
            a0Var.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5.b.b(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
