package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import java.util.Map;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class FirmwareColourPickerPreference extends Preference {
    public static final Map B = zt3.l0(new ti4(a82.GRAY, 6390426), new ti4(a82.BROWN, 12208384), new ti4(a82.RED, 16449560), new ti4(a82.PINK, 16485115), new ti4(a82.ORANGE, 16486912), new ti4(a82.YELLOW, 15983360), new ti4(a82.LIME, 11205376), new ti4(a82.GREEN, 64256), new ti4(a82.DARK_GREEN, 41528), new ti4(a82.TURQUOISE, 4840330), new ti4(a82.LIGHT_BLUE, 3193587), new ti4(a82.BLUE, 23027), new ti4(a82.DARK_BLUE, 146), new ti4(a82.PURPLE, 9044179), new ti4(a82.VIOLET, 13828331), new ti4(a82.FUCHSIA, 16449682));
    public View A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareColourPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setWidgetLayoutResource(R.layout.preference_firmware_colour_picker_colour);
    }

    public final void e(int i) {
        Integer num = (Integer) B.get((a82) ((f12) a82.getEntries()).get(i));
        if (num != null) {
            long intValue = 4278190080L | num.intValue();
            View view = this.A;
            if (view != null) {
                view.setBackgroundColor((int) intValue);
            } else {
                b53.g0("viewSelectedColour");
                throw null;
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        vs4Var.getClass();
        super.onBindViewHolder(vs4Var);
        View q = vs4Var.q(R.id.viewSelectedColour);
        q.getClass();
        this.A = q;
        e(getPersistedInt(0));
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_firmware_colour_picker, (ViewGroup) null, false);
        int i = R.id.layoutColourRow0;
        if (((LinearLayout) ep2.r(inflate, R.id.layoutColourRow0)) != null) {
            i = R.id.layoutColourRow1;
            if (((LinearLayout) ep2.r(inflate, R.id.layoutColourRow1)) != null) {
                i = R.id.layoutColourRow2;
                if (((LinearLayout) ep2.r(inflate, R.id.layoutColourRow2)) != null) {
                    i = R.id.layoutColourRow3;
                    if (((LinearLayout) ep2.r(inflate, R.id.layoutColourRow3)) != null) {
                        i = R.id.layoutGridColours;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ep2.r(inflate, R.id.layoutGridColours);
                        if (constraintLayout != null) {
                            i = R.id.viewColour00;
                            if (ep2.r(inflate, R.id.viewColour00) != null) {
                                i = R.id.viewColour01;
                                if (ep2.r(inflate, R.id.viewColour01) != null) {
                                    i = R.id.viewColour02;
                                    if (ep2.r(inflate, R.id.viewColour02) != null) {
                                        i = R.id.viewColour03;
                                        if (ep2.r(inflate, R.id.viewColour03) != null) {
                                            i = R.id.viewColour10;
                                            if (ep2.r(inflate, R.id.viewColour10) != null) {
                                                i = R.id.viewColour11;
                                                if (ep2.r(inflate, R.id.viewColour11) != null) {
                                                    i = R.id.viewColour12;
                                                    if (ep2.r(inflate, R.id.viewColour12) != null) {
                                                        i = R.id.viewColour13;
                                                        if (ep2.r(inflate, R.id.viewColour13) != null) {
                                                            i = R.id.viewColour20;
                                                            if (ep2.r(inflate, R.id.viewColour20) != null) {
                                                                i = R.id.viewColour21;
                                                                if (ep2.r(inflate, R.id.viewColour21) != null) {
                                                                    i = R.id.viewColour22;
                                                                    if (ep2.r(inflate, R.id.viewColour22) != null) {
                                                                        i = R.id.viewColour23;
                                                                        if (ep2.r(inflate, R.id.viewColour23) != null) {
                                                                            i = R.id.viewColour30;
                                                                            if (ep2.r(inflate, R.id.viewColour30) != null) {
                                                                                i = R.id.viewColour31;
                                                                                if (ep2.r(inflate, R.id.viewColour31) != null) {
                                                                                    i = R.id.viewColour32;
                                                                                    if (ep2.r(inflate, R.id.viewColour32) != null) {
                                                                                        i = R.id.viewColour33;
                                                                                        if (ep2.r(inflate, R.id.viewColour33) != null) {
                                                                                            sb sbVar = new sb(getContext());
                                                                                            ((pb) sbVar.L).d = getTitle();
                                                                                            sbVar.B((ConstraintLayout) inflate);
                                                                                            sbVar.x(R.string.cancel, new hm0(3));
                                                                                            tb C = sbVar.C();
                                                                                            mu muVar = new mu(5, constraintLayout);
                                                                                            qu1 qu1Var = new qu1(4);
                                                                                            e06 e06Var = e06.c0;
                                                                                            v72 v72Var = new v72(new y82(muVar, qu1Var));
                                                                                            while (v72Var.hasNext()) {
                                                                                                ((View) v72Var.next()).setOnClickListener(new b82(0, this, C));
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
