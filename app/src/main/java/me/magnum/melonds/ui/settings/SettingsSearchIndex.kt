package me.magnum.melonds.ui.settings

import android.app.Dialog
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import me.magnum.melonds.R
import me.magnum.melonds.ui.settings.fragments.AboutPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.AudioPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment
import me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.InputPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.RewindPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.SystemPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment
import me.magnum.melonds.ui.theme.AppThemeManager
import org.xmlpull.v1.XmlPullParser
import java.util.Locale

data class SearchPreferenceItem(
    val key: String,
    val title: String,
    val summary: String? = null,
    val sectionTitle: String,
    val fragmentClassName: String,
    val iconRes: Int = 0,
)

class SettingsSearchIndex(private val context: Context) {

    private data class ScreenDescriptor(
        val xmlResId: Int,
        val fragmentClass: String,
        val titleResId: Int,
        val iconResId: Int,
    )

    private val screenDescriptors = listOf(
        ScreenDescriptor(R.xml.pref_general, GeneralPreferencesFragment::class.java.name, R.string.category_general, R.drawable.ic_settings),
        ScreenDescriptor(R.xml.pref_general_updates, GeneralPreferencesFragment::class.java.name, R.string.category_general, R.drawable.ic_settings),
        ScreenDescriptor(R.xml.pref_roms, RomsPreferencesFragment::class.java.name, R.string.category_roms, R.drawable.ic_folder),
        ScreenDescriptor(R.xml.pref_save_files, SaveFilesPreferencesFragment::class.java.name, R.string.category_save_files, R.drawable.ic_file),
        ScreenDescriptor(R.xml.pref_system, SystemPreferencesFragment::class.java.name, R.string.category_system, R.drawable.ic_firmware),
        ScreenDescriptor(R.xml.pref_video, VideoPreferencesFragment::class.java.name, R.string.category_video, R.drawable.ic_video),
        ScreenDescriptor(R.xml.pref_audio, AudioPreferencesFragment::class.java.name, R.string.category_audio, R.drawable.ic_audio),
        ScreenDescriptor(R.xml.pref_input, InputPreferencesFragment::class.java.name, R.string.input, R.drawable.ic_input),
        ScreenDescriptor(R.xml.pref_retroachievements, RetroAchievementsPreferencesFragment::class.java.name, R.string.retroachievements, R.drawable.ic_trophy),
        ScreenDescriptor(R.xml.pref_cheats, CheatsPreferencesFragment::class.java.name, R.string.cheats, R.drawable.ic_cheat),
        ScreenDescriptor(R.xml.pref_translator, TranslatorPreferencesFragment::class.java.name, R.string.category_translator, R.drawable.ic_translate),
        ScreenDescriptor(R.xml.pref_about, AboutPreferencesFragment::class.java.name, R.string.about_app_title, R.drawable.ic_info),
        ScreenDescriptor(R.xml.pref_rewind, RewindPreferencesFragment::class.java.name, R.string.rewind, R.drawable.ic_clock),
        ScreenDescriptor(R.xml.pref_custom_firmware, CustomFirmwarePreferencesFragment::class.java.name, R.string.custom_bios_firmware, R.drawable.ic_firmware),
        ScreenDescriptor(R.xml.pref_internal_firmware_settings, FirmwarePreferencesFragment::class.java.name, R.string.internal_firmware_settings, R.drawable.ic_firmware),
        ScreenDescriptor(R.xml.pref_main, MainPreferencesFragment::class.java.name, R.string.settings, R.drawable.ic_settings),
    )

    private var cachedIndex: List<SearchPreferenceItem>? = null

    @Synchronized
    fun getIndex(): List<SearchPreferenceItem> {
        return cachedIndex ?: buildIndex().also { cachedIndex = it }
    }

    private fun buildIndex(): List<SearchPreferenceItem> {
        val items = ArrayList<SearchPreferenceItem>()
        val seenKeys = HashSet<String>()

        for (screen in screenDescriptors) {
            val parser = runCatching { context.resources.getXml(screen.xmlResId) }.getOrNull() ?: continue
            try {
                var eventType = parser.eventType
                var currentCategory: String? = null

                while (eventType != XmlPullParser.END_DOCUMENT) {
                    if (eventType == XmlPullParser.START_TAG) {
                        val tagName = parser.name
                        if (tagName == "PreferenceCategory") {
                            for (i in 0 until parser.attributeCount) {
                                if (parser.getAttributeName(i) == "title") {
                                    val resId = parser.getAttributeResourceValue(i, 0)
                                    currentCategory = if (resId != 0) {
                                        runCatching { context.getString(resId) }.getOrNull()
                                    } else {
                                        parser.getAttributeValue(i)
                                    }
                                    break
                                }
                            }
                        } else if (tagName != "PreferenceScreen") {
                            var key: String? = null
                            var title: String? = null
                            var summary: String? = null
                            var targetFragment: String? = null
                            var isVisible = true

                            for (i in 0 until parser.attributeCount) {
                                when (parser.getAttributeName(i)) {
                                    "key" -> key = parser.getAttributeValue(i)
                                    "title" -> {
                                        val resId = parser.getAttributeResourceValue(i, 0)
                                        title = if (resId != 0) {
                                            runCatching { context.getString(resId) }.getOrNull()
                                        } else {
                                            parser.getAttributeValue(i)
                                        }
                                    }
                                    "summary" -> {
                                        val resId = parser.getAttributeResourceValue(i, 0)
                                        summary = if (resId != 0) {
                                            runCatching { context.getString(resId) }.getOrNull()
                                        } else {
                                            parser.getAttributeValue(i)
                                        }
                                    }
                                    "fragment" -> targetFragment = parser.getAttributeValue(i)
                                    "isPreferenceVisible" -> {
                                        val resId = parser.getAttributeResourceValue(i, 0)
                                        isVisible = if (resId != 0) {
                                            runCatching { context.resources.getBoolean(resId) }.getOrDefault(true)
                                        } else {
                                            parser.getAttributeBooleanValue(i, true)
                                        }
                                    }
                                }
                            }

                            if (isVisible && !title.isNullOrBlank() && !key.isNullOrBlank()) {
                                val uniqueKey = "${screen.fragmentClass}::$key"
                                if (!seenKeys.contains(uniqueKey)) {
                                    seenKeys.add(uniqueKey)
                                    if (summary == "%s") summary = null

                                    val baseSection = context.getString(screen.titleResId)
                                    val fullSection = if (currentCategory != null && currentCategory != baseSection) {
                                        "$baseSection › $currentCategory"
                                    } else {
                                        baseSection
                                    }

                                    items.add(
                                        SearchPreferenceItem(
                                            key = key,
                                            title = title,
                                            summary = summary,
                                            sectionTitle = fullSection,
                                            fragmentClassName = targetFragment ?: screen.fragmentClass,
                                            iconRes = screen.iconResId,
                                        )
                                    )
                                }
                            }
                        }
                    }
                    eventType = parser.next()
                }
            } catch (e: Exception) {
                // Ignore XML parsing errors for safety
            } finally {
                parser.close()
            }
        }

        return items
    }

    fun search(query: String): List<SearchPreferenceItem> {
        val q = normalize(query.trim())
        if (q.isEmpty()) return emptyList()

        return getIndex().filter { item ->
            normalize(item.title).contains(q) ||
                (item.summary != null && normalize(item.summary).contains(q)) ||
                normalize(item.sectionTitle).contains(q) ||
                normalize(item.key).contains(q)
        }
    }

    private fun normalize(text: String): String {
        return text.lowercase(Locale.ROOT)
            .replace('ё', 'е')
            .replace('Ё', 'Е')
    }
}

class SettingsSearchDialog(
    private val context: Context,
    private val activity: SettingsActivity,
) : Dialog(context) {

    private val searchIndex = SettingsSearchIndex(context)
    private val adapter = SearchResultsAdapter()
    private val density = context.resources.displayMetrics.density

    private fun dp(value: Int): Int = (value * density).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        val accentColor = AppThemeManager.getAccentColor()
        val isDark = AppThemeManager.currentTheme != me.magnum.melonds.ui.Theme.LIGHT
        val backgroundColor = if (isDark) 0xFF141923.toInt() else 0xFFF8FAFC.toInt()
        val cardBgColor = if (isDark) 0xFF1E2638.toInt() else 0xFFFFFFFF.toInt()
        val strokeColor = if (isDark) 0xFF334155.toInt() else 0xFFE2E8F0.toInt()
        val textColorPrimary = if (isDark) 0xFFFFFFFF.toInt() else 0xFF0F172A.toInt()
        val textColorSecondary = 0xFF94A3B8.toInt()

        val root = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            background = GradientDrawable().apply {
                setColor(backgroundColor)
                cornerRadius = dp(16).toFloat()
                setStroke(dp(1), strokeColor)
            }
            setPadding(dp(16), dp(16), dp(16), dp(16))
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
        }

        // Header Title
        val headerTitle = TextView(context).apply {
            text = context.getString(R.string.v780_search_settings_title)
            setTextColor(textColorPrimary)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 17f)
            typeface = Typeface.DEFAULT_BOLD
            setPadding(0, 0, 0, dp(12))
        }
        root.addView(headerTitle)

        // Search Input Bar Container
        val searchContainer = LinearLayout(context).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            background = GradientDrawable().apply {
                setColor(cardBgColor)
                cornerRadius = dp(10).toFloat()
                setStroke(dp(1), accentColor)
            }
            setPadding(dp(12), dp(8), dp(12), dp(8))
        }

        val searchIcon = ImageView(context).apply {
            setImageResource(R.drawable.ic_search)
            imageTintList = ColorStateList.valueOf(accentColor)
            layoutParams = LinearLayout.LayoutParams(dp(20), dp(20))
        }
        searchContainer.addView(searchIcon)

        val searchInput = EditText(context).apply {
            hint = context.getString(R.string.v780_search_settings_hint)
            setHintTextColor(textColorSecondary)
            setTextColor(textColorPrimary)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 15f)
            setBackgroundColor(Color.TRANSPARENT)
            setSingleLine(true)
            setPadding(dp(10), 0, dp(10), 0)
            layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        }
        searchContainer.addView(searchInput)

        val clearBtn = ImageView(context).apply {
            setImageResource(android.R.drawable.ic_menu_close_clear_cancel)
            imageTintList = ColorStateList.valueOf(textColorSecondary)
            layoutParams = LinearLayout.LayoutParams(dp(20), dp(20))
            visibility = View.GONE
            setOnClickListener {
                searchInput.setText("")
            }
        }
        searchContainer.addView(clearBtn)
        root.addView(searchContainer)

        // Status / Count Label
        val statusText = TextView(context).apply {
            setTextColor(textColorSecondary)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
            setPadding(dp(2), dp(8), 0, dp(6))
            text = ""
        }
        root.addView(statusText)

        // Results RecyclerView
        val recyclerView = RecyclerView(context).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = this@SettingsSearchDialog.adapter
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                dp(340),
            )
            clipToPadding = false
        }
        root.addView(recyclerView)

        // Empty state view
        val emptyView = TextView(context).apply {
            text = context.getString(R.string.v780_search_no_results)
            setTextColor(textColorSecondary)
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
            gravity = Gravity.CENTER
            visibility = View.GONE
            layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dp(120))
        }
        root.addView(emptyView)

        setContentView(root)

        window?.apply {
            setBackgroundDrawableResource(android.R.color.transparent)
            val width = (context.resources.displayMetrics.widthPixels * 0.92f).toInt()
            setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        }

        searchInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                val q = s?.toString().orEmpty()
                clearBtn.visibility = if (q.isNotEmpty()) View.VISIBLE else View.GONE
                val results = searchIndex.search(q)
                adapter.submitList(results)

                if (q.isBlank()) {
                    statusText.text = ""
                    emptyView.visibility = View.GONE
                    recyclerView.visibility = View.VISIBLE
                } else if (results.isEmpty()) {
                    statusText.text = context.getString(R.string.v780_search_no_results)
                    emptyView.visibility = View.VISIBLE
                    recyclerView.visibility = View.GONE
                } else {
                    statusText.text = context.getString(R.string.v780_search_results_count, results.size)
                    emptyView.visibility = View.GONE
                    recyclerView.visibility = View.VISIBLE
                }
            }
        })

        adapter.onItemClick = { item ->
            dismiss()
            activity.navigateToPreference(item.fragmentClassName, item.key)
        }

        searchInput.post {
            searchInput.requestFocus()
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.showSoftInput(searchInput, InputMethodManager.SHOW_IMPLICIT)
        }
    }

    private inner class SearchResultsAdapter : RecyclerView.Adapter<SearchResultsAdapter.VH>() {
        private var items: List<SearchPreferenceItem> = emptyList()
        var onItemClick: ((SearchPreferenceItem) -> Unit)? = null

        fun submitList(list: List<SearchPreferenceItem>) {
            items = list
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            val isDark = AppThemeManager.currentTheme != me.magnum.melonds.ui.Theme.LIGHT
            val itemBg = if (isDark) 0xFF182030.toInt() else 0xFFF1F5F9.toInt()
            val accentColor = AppThemeManager.getAccentColor()
            val textColorPrimary = if (isDark) 0xFFFFFFFF.toInt() else 0xFF0F172A.toInt()
            val textColorSecondary = 0xFF94A3B8.toInt()

            val row = LinearLayout(parent.context).apply {
                orientation = LinearLayout.HORIZONTAL
                gravity = Gravity.CENTER_VERTICAL
                background = GradientDrawable().apply {
                    setColor(itemBg)
                    cornerRadius = dp(8).toFloat()
                }
                setPadding(dp(10), dp(8), dp(10), dp(8))
                val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply {
                    setMargins(0, dp(4), 0, dp(4))
                }
                layoutParams = lp
                isClickable = true
                isFocusable = true
            }

            val icon = ImageView(parent.context).apply {
                imageTintList = ColorStateList.valueOf(accentColor)
                layoutParams = LinearLayout.LayoutParams(dp(22), dp(22)).apply {
                    setMargins(0, 0, dp(12), 0)
                }
            }
            row.addView(icon)

            val textContainer = LinearLayout(parent.context).apply {
                orientation = LinearLayout.VERTICAL
                layoutParams = LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
            }

            val sectionView = TextView(parent.context).apply {
                setTextColor(accentColor)
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 11f)
                typeface = Typeface.DEFAULT_BOLD
            }
            textContainer.addView(sectionView)

            val titleView = TextView(parent.context).apply {
                setTextColor(textColorPrimary)
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
                typeface = Typeface.DEFAULT_BOLD
            }
            textContainer.addView(titleView)

            val summaryView = TextView(parent.context).apply {
                setTextColor(textColorSecondary)
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                maxLines = 2
            }
            textContainer.addView(summaryView)

            row.addView(textContainer)

            return VH(row, icon, sectionView, titleView, summaryView)
        }

        override fun onBindViewHolder(holder: VH, position: Int) {
            val item = items[position]
            holder.icon.setImageResource(if (item.iconRes != 0) item.iconRes else R.drawable.ic_settings)
            holder.sectionView.text = item.sectionTitle
            holder.titleView.text = item.title
            if (!item.summary.isNullOrBlank()) {
                holder.summaryView.visibility = View.VISIBLE
                holder.summaryView.text = item.summary
            } else {
                holder.summaryView.visibility = View.GONE
            }
            holder.itemView.setOnClickListener {
                onItemClick?.invoke(item)
            }
        }

        override fun getItemCount() = items.size

        inner class VH(
            view: View,
            val icon: ImageView,
            val sectionView: TextView,
            val titleView: TextView,
            val summaryView: TextView,
        ) : RecyclerView.ViewHolder(view)
    }
}
