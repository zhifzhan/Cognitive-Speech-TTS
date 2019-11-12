﻿using System.Collections.Generic;

namespace CustomVoice_API.API.DTO
{
    class ProjectDefinition
    {
        private ProjectDefinition(
            string name,
            string description,
            string locale,
            IReadOnlyDictionary<string, string> properties,
            string projectKind)
        {
            this.Name = name;
            this.Description = description;
            this.Locale = locale;
            this.Properties = properties;
            this.ProjectKind = projectKind;
        }

        public string Name { get; private set; }

        public string Description { get; private set; }

        public string Locale { get; private set; }

        public IReadOnlyDictionary<string, string> Properties { get; private set; }

        public string ProjectKind { get; private set; }

        public static ProjectDefinition Create(
            string name,
            string description,
            string locale,
            IReadOnlyDictionary<string, string> properties,
            string projectKind)
        {
            return new ProjectDefinition(
                    name,
                    description,
                    locale,
                    properties,
                    projectKind);
        }
    }
}
