package me.magnum.melonds.ui.settings.preferences;

import a0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.i0;
import fc.a;
import fc.b;
import java.util.Set;
import k7.w;
import kf.c0;
import m9.o;
import me.magnum.melonds.R;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1;
import me.magnum.melonds.ui.settings.preferences.BiosDirectoryPickerPreference;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import oe.g;
import oe.i;
import rd.n;
import sd.f;
import zb.l;
import zb.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class BiosDirectoryPickerPreference extends StoragePickerPreference {
    public ConsoleType X;
    public CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 Y;
    public i Z;

    /* renamed from: b0  reason: collision with root package name */
    public ImageView f9628b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiosDirectoryPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setWidgetLayoutResource(R.layout.preference_directory_picker_status);
        StoragePickerPreference.a aVar = StoragePickerPreference.a.DIRECTORY;
        aVar.getClass();
        this.A = aVar;
        f fVar = f.READ_WRITE;
        fVar.getClass();
        this.B = fVar;
        this.L = true;
    }

    @Override // me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
    public final void e(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, n.f12714a, 0, 0);
        obtainStyledAttributes.getClass();
        a entries = ConsoleType.getEntries();
        if (obtainStyledAttributes.hasValue(0)) {
            this.X = (ConsoleType) ((b) entries).get(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            return;
        }
        j.h("Attribute not defined in set.");
    }

    @Override // me.magnum.melonds.ui.settings.preferences.StoragePickerPreference
    public final void f(Uri uri) {
        super.f(uri);
        if (uri == null) {
            return;
        }
        h(uri);
    }

    public final void g() {
        int i2;
        final i iVar;
        final ImageView imageView = this.f9628b0;
        if (imageView != null) {
            if (!isEnabled()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            if (isEnabled() && (iVar = this.Z) != null) {
                int i10 = fi.b.f4966a[iVar.f10937b.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            ViewParent parent = imageView.getParent();
                            parent.getClass();
                            ((View) parent).setVisibility(0);
                            imageView.setImageResource(R.drawable.ic_status_error);
                            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.statusError)));
                        } else {
                            o.o();
                            return;
                        }
                    } else {
                        ViewParent parent2 = imageView.getParent();
                        parent2.getClass();
                        ((View) parent2).setVisibility(0);
                        imageView.setImageResource(R.drawable.ic_status_warn);
                        imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.statusWarn)));
                    }
                } else {
                    ViewParent parent3 = imageView.getParent();
                    parent3.getClass();
                    ((View) parent3).setVisibility(8);
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: fi.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Context context = BiosDirectoryPickerPreference.this.getContext();
                        context.getClass();
                        yb.j[] jVarArr = iVar.f10939d;
                        jVarArr.getClass();
                        ViewGroup viewGroup = null;
                        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_config_files, (ViewGroup) null, false);
                        LinearLayout linearLayout = (LinearLayout) w.k(inflate, R.id.layoutFileItems);
                        if (linearLayout != null) {
                            PopupWindow popupWindow = new PopupWindow((LinearLayout) inflate, -2, -2);
                            popupWindow.setOutsideTouchable(true);
                            int length = jVarArr.length;
                            int i11 = 0;
                            while (i11 < length) {
                                yb.j jVar = jVarArr[i11];
                                View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_file_status, viewGroup, false);
                                int i12 = R.id.imageViewFileStatus;
                                ImageView imageView2 = (ImageView) w.k(inflate2, R.id.imageViewFileStatus);
                                if (imageView2 != null) {
                                    i12 = R.id.textFileName;
                                    TextView textView = (TextView) w.k(inflate2, R.id.textFileName);
                                    if (textView != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) inflate2;
                                        int i13 = ci.f.f2889a[((g) jVar.B).ordinal()];
                                        if (i13 != 1) {
                                            if (i13 != 2) {
                                                if (i13 == 3) {
                                                    imageView2.setImageResource(R.drawable.ic_status_error);
                                                    imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.statusError)));
                                                } else {
                                                    o.o();
                                                    return;
                                                }
                                            } else {
                                                imageView2.setImageResource(R.drawable.ic_status_warn);
                                                imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.statusWarn)));
                                            }
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_status_ok);
                                            imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.statusOk)));
                                        }
                                        textView.setText((CharSequence) jVar.A);
                                        linearLayout.addView(linearLayout2);
                                        i11++;
                                        viewGroup = null;
                                    }
                                }
                                o.i("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
                                return;
                            }
                            ImageView imageView3 = imageView;
                            imageView3.getClass();
                            popupWindow.getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            int[] iArr = new int[2];
                            imageView3.getLocationOnScreen(iArr);
                            Rect rect = new Rect();
                            int i14 = iArr[0];
                            rect.left = i14;
                            rect.top = iArr[1];
                            rect.right = imageView3.getWidth() + i14;
                            rect.bottom = imageView3.getHeight() + iArr[1];
                            popupWindow.showAtLocation(imageView3, 8388659, rect.right - popupWindow.getContentView().getMeasuredWidth(), rect.height() + rect.top);
                            return;
                        }
                        o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.layoutFileItems)));
                    }
                });
            }
        }
    }

    public final void h(Uri uri) {
        i iVar;
        boolean isEnabled = isEnabled();
        ImageView imageView = this.f9628b0;
        if (!isEnabled) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        CustomFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 = this.Y;
        if (customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1 != null) {
            ConsoleType consoleType = this.X;
            consoleType.getClass();
            c0 c0Var = ((gi.b) customFirmwarePreferencesFragment$onCreatePreferences$biosValidator$1.f9588a.Y.getValue()).f5672b;
            c0Var.getClass();
            int i2 = df.a.f4052a[consoleType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    iVar = c0Var.a(ConsoleType.DSi, uri);
                } else {
                    o.o();
                    return;
                }
            } else {
                iVar = c0Var.a(ConsoleType.DS, uri);
            }
        } else {
            iVar = null;
        }
        this.Z = iVar;
        g();
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
        Uri uri;
        a();
        Set<String> persistedStringSet = getPersistedStringSet(s.A);
        persistedStringSet.getClass();
        String str = (String) l.S(persistedStringSet);
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        h(uri);
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        i0Var.getClass();
        super.onBindViewHolder(i0Var);
        View q10 = i0Var.q(R.id.imageViewStatus);
        q10.getClass();
        this.f9628b0 = (ImageView) q10;
        g();
    }

    @Override // androidx.preference.Preference
    public final void onDependencyChanged(Preference preference, boolean z10) {
        int i2;
        preference.getClass();
        super.onDependencyChanged(preference, z10);
        ImageView imageView = this.f9628b0;
        if (imageView != null) {
            if (z10) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }
}
